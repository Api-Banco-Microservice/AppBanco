package com.nttdata.abs.transaction.client.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

	private int number;
	private String nroclient;
	private double amount;
	private String type;
	private boolean statedebt;
	private int nrotransactions;
	private double maintenance;
	private int movementlimit;
    
}
