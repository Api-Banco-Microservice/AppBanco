package com.nttdata.abs.transaction.service;

import java.util.List;

import com.nttdata.abs.transaction.entity.Transaction;

public interface TransactionService {

    public abstract List<Transaction> findAll();
    public abstract Transaction findById(Long id);
    public abstract Transaction createTransaction(Transaction transaction);
    public abstract Transaction updateTransaction(Transaction transaction);
    public abstract void deleteTransaction(Long id);
    public abstract void actionForTransaction(int idType, double amount);
    
}
