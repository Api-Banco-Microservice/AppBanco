package com.nttdata.abs.customer.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PersonalClient extends Client {

	private String lastname;
	private String dni;
	private String age;
	private String nroAccount;
	
}
