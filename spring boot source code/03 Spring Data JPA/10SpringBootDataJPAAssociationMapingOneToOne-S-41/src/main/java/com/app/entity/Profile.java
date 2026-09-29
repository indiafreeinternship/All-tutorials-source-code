package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="profiletab")
public class Profile {

	@Id
	@Column(name="pid")
	private Integer profId;
	
	@Column(name="pcode")
	private String actCode;
	
	@Column(name="pdsg")
	private String desgn;
}
