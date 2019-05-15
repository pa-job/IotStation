
	/**  
     * @Title: userService.java
 	 * @Package cn.userCenter.service.impl
 	 * @Description: )
 	 * @author zhugang
 	 * @date 2019年1月12日
 	 * @version V1.0  
 	 */

        
package cn.soa.service.impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.soa.dao.LogMapper;
import cn.soa.entity.LogRecord;
import cn.soa.service.inter.LogServiceInter;



	/**
 	 * @ClassName: userService
 	 * @Description: 用户信息服务  - 业务层
 	 * @author zhugang
 	 * @date 2019年1月12日
 	 */
@Service
public class LogService implements LogServiceInter{
	private static Logger logger = LoggerFactory.getLogger( LogService.class );

	@Autowired
	private LogMapper logMapper;

	@Override
	public List<LogRecord> findAll(){
		try {
			List<LogRecord> logs = logMapper.findAll();
			return logs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	@Override
	public List<LogRecord> findByUserid( String userid ){
		try {
			List<LogRecord> logs = logMapper.findByUserid(userid);
			return logs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	@Override
	public int saveOrganBackId( LogMapper logrecord ) {
		try {
			LogRecord l = new LogRecord();
			int i = logMapper.saveLogBackId( l );
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}	
	}
	
}
