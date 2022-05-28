package com.nttdata.abs.customer.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BussinessClient extends Client {
	
	private String ruc;
	
}
