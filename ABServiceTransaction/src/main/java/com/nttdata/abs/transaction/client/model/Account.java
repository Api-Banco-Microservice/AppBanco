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
	
	private String number;
	private String nroClient;
	private String amount;
	private String type;
	private String stateDebt;
	private String nroTransactions;
	private String maintenance;
	private String movementLimit;
    
}
