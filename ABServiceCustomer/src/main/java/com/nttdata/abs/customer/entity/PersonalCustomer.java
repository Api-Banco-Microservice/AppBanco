package com.nttdata.abs.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "personal_customers")
@PrimaryKeyJoinColumn(name = "personal_customer")
public class PersonalCustomer extends Customer {

	private static final long serialVersionUID = 1L;
	private String lastname;
	private String dni;
	private String age;
	@Column(name = "nro_account")
	private String nroAccount;
	@Column(name = "savings_account")
	private boolean savingsAccount;
	@Column(name = "fixed_term_account")
	private boolean fixedTermAccount;
	@Column(name = "current_account")
	private boolean currentAccount;
	
}
