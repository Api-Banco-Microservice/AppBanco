package com.nttdata.abs.customer.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "bussinessCustomers")
@PrimaryKeyJoinColumn(name = "bussiness_customer")
public class BussinessCustomer extends Customer {
	
	private static final long serialVersionUID = 1L;
	private String ruc;
	
}
