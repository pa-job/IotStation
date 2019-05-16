package cn.soa.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Alarm implements Serializable{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )	
	private Long paid;
	private String pname;
	private String value;
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")   
	private Date recordTime;
	private String remark1;
	private String remark2;
	private String remark3;
}
