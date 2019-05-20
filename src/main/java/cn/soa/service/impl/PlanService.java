package cn.soa.service.impl;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.soa.controller.MonitorDataCreater;
import cn.soa.dao.CurrentValueRepository;
import cn.soa.dao.PositionRepository;
import cn.soa.dao.TotalValueRepository;
import cn.soa.entity.Position;
import cn.soa.entity.TotalValue;
import cn.soa.service.inter.CreateMonitorDataSI;

@Component
public class PlanService {
	private static Logger logger = LoggerFactory.getLogger( PlanService.class );
	
	@Autowired
	private CreateMonitorDataSI createMonitorDataS;
	
	@Autowired 
	private PositionRepository positionRepository;
	
	@Autowired
	private TotalValueRepository totalValueRepository;
		
	@Scheduled(cron="0 0 12 * * ?")
    private void configureTasks() {
		try {
			List<Position> positions = positionRepository.findAll();
			ArrayList<String> positionStrs = new ArrayList<String>();
			for( Position p : positions ) {
				positionStrs.add( p.getPname() );
			}
			Map<String, Object> values = createMonitorDataS.createTMonitorData(positionStrs);
			ArrayList<TotalValue> totalValues = new ArrayList<TotalValue>();
			for( Entry<String,Object> m : values.entrySet()) {
				TotalValue t = new TotalValue();
				t.setPname( m.getKey() );
				t.setRecorddate( new java.sql.Date(System.currentTimeMillis()) );
				t.setValue( m.getValue().toString() );
				totalValues.add( t );
			}
			List<TotalValue> ts = totalValueRepository.saveAll( totalValues );
			logger.debug( ts.toString() );
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
    }
}
