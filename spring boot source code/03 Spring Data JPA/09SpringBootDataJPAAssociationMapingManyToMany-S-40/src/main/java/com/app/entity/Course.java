package com.app.entity;

import java.util.List;

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
@Table(name="crstab")
public class Course {
	
	@Id
	@Column(name="cid")
	private Integer courseId;
	
	@Column(name="cname")
	private String courseName;
	
	@Column(name="ccost")
	private double courseCost;

}
