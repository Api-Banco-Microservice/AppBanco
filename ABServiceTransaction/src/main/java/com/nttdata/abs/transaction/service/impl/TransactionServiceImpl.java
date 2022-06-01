package com.nttdata.abs.transaction.service.impl;

import java.util.List;

import com.nttdata.abs.transaction.entity.Transaction;
import com.nttdata.abs.transaction.repository.TransactionRepository;
import com.nttdata.abs.transaction.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository repository;

    @Override
    public List<Transaction> findAll() {
        return repository.findAll();
    }

    @Override
    public Transaction findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return repository.save(transaction);
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {
        return repository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long id) {
        repository.deleteById(id);
    }
    
}
