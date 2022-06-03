package com.nttdata.abs.customer.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PersonalClient extends Customer {

	private String lastname;
	private String dni;
	private String age;
	private String nroAccount;
	private boolean savingsAccount;
	private boolean fixedTermAccount;
	private boolean currentAccount;
	
}
