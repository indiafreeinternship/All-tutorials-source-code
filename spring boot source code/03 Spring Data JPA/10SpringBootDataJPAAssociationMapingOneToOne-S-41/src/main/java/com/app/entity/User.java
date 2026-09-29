package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="usertab")
public class User {
	
	@Id
	@Column(name="uid")
	private Integer userId;
	
	@Column(name="uname")
	private String userName;
	
	@Column(name="upwd")
	private String userPwd;
	
	
	
	/*@ManyToOne
	@JoinColumn(name="pidFK", unique = true)*/
	
	
	@OneToOne
	@JoinColumn(name="pidFK")
	
	Profile pob;

}
