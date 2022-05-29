package com.nttdata.abs.passives.entity;

import javax.persistence.Entity;
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
@Table(name = "accounts")
public class Account {
	
	@Id
	private String number;
	private String nroClient;
	private String amount;
	private String type;
	private String stateDebt;
	private String nroTransactions;
	private String maintenance;
	private String movementLimit;
    
}
