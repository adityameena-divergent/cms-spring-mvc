package com.divergentsl.cms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "admin")
@Getter
@Setter
public class Admin {

	@Id
	@Column(name = "username")
	String username;
	
	@Column(name = "password")
	String password;
	
}
