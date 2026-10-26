package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="producttab")
public class Product {
	
	@Id
	@Column(name="pid")
	private Integer prodId;
	
	@Column(name="pcode")
	private String prodCode;
	
	@Column(name="pcost")
	private double prodCost;
	
	@Lob // BLOB
	@Column(name="pimg", columnDefinition = "LONGBLOB")
	private byte[] prodImg;
	
	@Lob//CLOB
	@Column(name="pdsc")
	private char[] prodDesc;

}
