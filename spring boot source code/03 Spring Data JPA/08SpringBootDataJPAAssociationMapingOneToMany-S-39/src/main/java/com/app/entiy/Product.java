package com.app.entiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="prodtable")
public class Product {

	@Id
	@JoinColumn(name="pid")
	private Integer prodId;
	
	private String prodCode;
	
	@Column(name="pcost")
	private Double prodCost;
	
}
