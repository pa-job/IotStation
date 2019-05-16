package cn.soa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.soa.entity.headResult.ResultJson;

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
	
	@GetMapping("/current")
	public ResultJson<Map<String,Object>> getCurrentData(
			@RequestParam List<String> params ){
		logger.debug( params.toString() );
		Map<String,Object> values = new HashMap<String,Object>();
		for( String s : params ) {
			switch( s ) {
				case "1-param-1":
					values.put( s, new Random().doubles(15, 25));
					break;
				case "1-param-2":
					values.put( s, new Random().doubles(15, 25));
					break;
				case "1-param-3":
					values.put( s, new Random().doubles(15, 25));
					break;
				case "2-param-1":
					values.put( s, new Random().doubles(15, 25));
					break;
				case "2-param-2":
					values.put( s, new Random().doubles(15, 25));
					break;
				case "2-param-3":
					values.put( s, new Random().doubles(15, 25));
					break;
				case "3-param-1":
					values.put( s, new Random().doubles(15, 25));
					break;
				case "3-param-2":
					values.put( s, new Random().doubles(15, 25));
					break;
				case "3-param-3":
					values.put( s, new Random().doubles(15, 25));
					break;
			}
			logger.debug( values.toString() );
		}
		return new ResultJson<Map<String,Object>>( 0, "获取实时数据成功", values );
	}
	
	@GetMapping("/total")
	public ResultJson<Map<String,Object>> getTotalData(
			@RequestParam List<String> params ){
		logger.debug( params.toString() );
		Map<String,Object> values = new HashMap<String,Object>();
		for( String s : params ) {
			switch( s ) {
				case "1-param-1":
					values.put( s, new Random().doubles(150, 250));
					break;
				case "1-param-2":
					values.put( s, new Random().doubles(150, 250));
					break;
				case "1-param-3":
					values.put( s, new Random().doubles(150, 250));
					break;
				case "2-param-1":
					values.put( s, new Random().doubles(150, 250));
					break;
				case "2-param-2":
					values.put( s, new Random().doubles(150, 250));
					break;
				case "2-param-3":
					values.put( s, new Random().doubles(150, 250));
					break;
				case "3-param-1":
					values.put( s, new Random().doubles(150, 250));
					break;
				case "3-param-2":
					values.put( s, new Random().doubles(150, 250));
					break;
				case "3-param-3":
					values.put( s, new Random().doubles(150, 250));
					break;
			}
			logger.debug( values.toString() );
		}
		return new ResultJson<Map<String,Object>>( 0, "获取累计数据成功", values );
	}
}
