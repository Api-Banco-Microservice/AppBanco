package com.nttdata.abs.customer.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "personalCustomers")
@PrimaryKeyJoinColumn(name = "personal_customer")
public class PersonalCustomer extends Customer {

	private static final long serialVersionUID = 1L;
	private String lastname;
	private String dni;
	private String age;
	private String nroAccount;
	private boolean savingsAccount;
	private boolean fixedTermAccount;
	private boolean currentAccount;
	
}
