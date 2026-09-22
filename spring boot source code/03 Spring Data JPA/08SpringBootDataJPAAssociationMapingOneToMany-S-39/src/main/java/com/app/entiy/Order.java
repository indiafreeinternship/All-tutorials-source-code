package com.app.entiy;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="ordtab")
public class Order {

	@Id
	@Column(name="ordid")
	private Integer ordId;
	
	@Column(name="ordmode")
	private String ordMode;
	
	@Column(name="orddisc")
	private Double discount;
	
	@OneToMany
	@JoinColumn(name="ordIdFK")
	private List<Product> pob; // HAS-A
	
}
