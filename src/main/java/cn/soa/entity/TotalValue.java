package cn.soa.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings( "serial" )  
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors( chain=true )
@Validated
@Entity
public class TotalValue implements Serializable{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )	
	private Long tvid;
	private String pname;
	private String value;
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss") 
	private Date recorddate;
	private String note;
	private String remark1;
	private String remark2 ;
	private String remark3 ;
}
