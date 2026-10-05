package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="booktab")
public class Book {
	
	@Id
	@Column(name="bid")
	private Integer bookId;
	
	@Column(name="bname")
	private String bookName;
	
	@Column(name="bcost")
	private Double bookCost;
	
	@Column(name="bauth")
	private String bookAuthor;
	
	@Column(name="btype")
	private String bookType;

}
