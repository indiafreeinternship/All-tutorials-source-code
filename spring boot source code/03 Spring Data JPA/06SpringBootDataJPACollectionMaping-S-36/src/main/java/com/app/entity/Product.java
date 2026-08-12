package com.app.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="prodtab")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	private Integer prodId;
	private String prodName;
	
	@ElementCollection
	@CollectionTable(name="prod_vendors",
	joinColumns = @JoinColumn(name="prodIdFK")
	)
	@Column(name="vendor")
	private Set<String> vendors;
	
	@ElementCollection
	@CollectionTable(name="prod_versions", joinColumns = @JoinColumn(name="prodIdFK"))
	@OrderColumn(name="pos") // index column
	@Column(name="verion")
	private List<String> versions;
	
	
	@ElementCollection
	@CollectionTable(name="prod_clients", joinColumns = @JoinColumn(name="prodIdFK"))
	@MapKeyColumn(name="code")
	@Column(name="cname")
	private Map<String,String> clients;
	
	

}
