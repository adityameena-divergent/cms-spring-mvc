package com.divergentsl.cms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "patient")
@Setter
@Getter
@ToString
public class Patient {
	
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "weight")
	private int weight;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "contact_number")
	private int contactNumber;
	
	@Column(name = "address")
	private String address;
	
}
