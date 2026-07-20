package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="booktab")
public class BookEntity {
	
	@Id
	@Column(name="bid")
	private Integer bookId;
	
	@Column(name="bname")
	private String bookName;
	
	@Column(name="bauthor")
	private String bookAuthor;
	
	@Column(name="bcost")
	private Double bookCost;
	
	

}
