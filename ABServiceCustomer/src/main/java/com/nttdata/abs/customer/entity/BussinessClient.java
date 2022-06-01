package com.nttdata.abs.customer.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BussinessClient extends Customer {
	
	private static final long serialVersionUID = 1L;
	private String ruc;
	
}
