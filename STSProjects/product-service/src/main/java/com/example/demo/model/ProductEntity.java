package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "P_Id", unique = true, nullable = false)
	private String productId;
	@Column(name = "P_Name", nullable = false)
	private String productName;
	@Column(name = "P_Price", nullable = false)
	private double productPrice;

}
