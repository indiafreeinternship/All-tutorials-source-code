package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="emptab")
public class Employee {

	/**
	 * create table emptab(
	 * 	eid inetger not null,
	 * ename varchar(255),
	 * esal double,
	 * primary key(eid)
	 * );
	 * 
	 * */
	
	
	
	
	@Id
	@Column(name="eid")
	private Integer empId;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="esal")
	private Double empSal;

}
