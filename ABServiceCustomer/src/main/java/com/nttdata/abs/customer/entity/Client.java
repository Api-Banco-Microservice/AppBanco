package com.nttdata.abs.customer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class Client implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true , nullable = false)
	private Long id;
	private String name;
	private String address;
	private String email;
	private String state;
	
}
