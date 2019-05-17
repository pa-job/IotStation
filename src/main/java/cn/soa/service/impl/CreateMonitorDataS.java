package cn.soa.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.soa.controller.MonitorDataCreater;
import cn.soa.service.inter.CreateMonitorDataSI;

public class CreateMonitorDataS implements CreateMonitorDataSI{
	private static Logger logger = LoggerFactory.getLogger( CreateMonitorDataS.class );
	
	@Override
	public Map<String,Object> createMonitorData( List<String> params ){
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
		return values;		
	}
	
	@Override
	public Map<String,Object> createTMonitorData( List<String> params ){
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
		return values;
	}
}
