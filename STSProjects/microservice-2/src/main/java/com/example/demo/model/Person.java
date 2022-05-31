package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "person_ms")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="pid")
	private String pid;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;

}
