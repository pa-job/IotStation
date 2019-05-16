package cn.soa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.validation.annotation.Validated;

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
public class Equipement implements Serializable{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )	
	private Long eqid ;
	private String ename ;
	private String etype ;
	private String note ;
	private String remark1;
	private String remark2 ;
	private String remark3 ;
}
