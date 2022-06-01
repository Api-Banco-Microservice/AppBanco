package com.nttdata.abs.transaction.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transactions")
public class Transaction implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "number", nullable = false, unique = true)
	private String number;

	//Pendiente a enlazar con los otros servicios
	private Long account;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Type type;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_register")
	private Date dateRegister;
	
}
