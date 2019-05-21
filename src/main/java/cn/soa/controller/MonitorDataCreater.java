package cn.soa.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.soa.entity.headResult.ResultJson;
import cn.soa.service.inter.CreateMonitorDataSI;

/**
 * @ClassName: MonitorDataCreater
 * @Description: 数据模拟器
 * @author zhugang
 * @date 2019年5月16日
 */
@RestController
@RequestMapping("/monitorData")
public class MonitorDataCreater {
	private static Logger logger = LoggerFactory.getLogger( MonitorDataCreater.class );
	
	@Autowired
	private CreateMonitorDataSI createMonitorDataS;
	
	@GetMapping("/current")
	public ResultJson<Map<String,Object>> getCurrentData(
			 @RequestParam("params[]") String[]  params ){
		logger.debug( params.toString() );
		Map<String, Object> values = createMonitorDataS.createMonitorData(Arrays.asList(params));
		return new ResultJson<Map<String,Object>>( 0, "获取实时数据成功", values );
	}
	
	@GetMapping("/total")
	public ResultJson<Map<String,Object>> getTotalData(
			@RequestParam List<String> params ){
		logger.debug( params.toString() );
		Map<String, Object> values = createMonitorDataS.createTMonitorData(params);
		return new ResultJson<Map<String,Object>>( 0, "获取累计数据成功", values );
	}
}
