package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "school_table")
public class SchoolEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int schoolId;
	
	@Column(name = "school_name", unique = true)
	private String schoolName;
}
