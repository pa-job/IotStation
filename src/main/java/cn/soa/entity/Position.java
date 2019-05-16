package cn.soa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class Position  implements Serializable{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )	
	private Long poid;
	private String eqid;
	private String pname;
	private String pvalue;
	private String punit;
	private String gvalue;
	private String lvalue;
	private String agvalue;
	private String alvalue;
	private String remark1;
	private String remark2;
	private String remark3;
}
