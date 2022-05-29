package com.nttdata.abs.transaction.repository;

import com.nttdata.abs.transaction.entity.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
