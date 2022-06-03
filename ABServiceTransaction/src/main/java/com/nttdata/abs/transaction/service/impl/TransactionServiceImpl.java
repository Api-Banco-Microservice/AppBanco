package com.nttdata.abs.transaction.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.abs.transaction.client.ProductClient;
import com.nttdata.abs.transaction.client.model.Account;
import com.nttdata.abs.transaction.entity.Transaction;
import com.nttdata.abs.transaction.repository.TransactionRepository;
import com.nttdata.abs.transaction.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository repository;

    @Autowired
    private ProductClient productClient;

    @Override
    public List<Transaction> findAll() {
        return repository.findAll();
    }

    @Override
    public Transaction findById(Long id) {
        return feignFindById(id);
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
		actionForTransaction(transaction.getType().getId(), transaction.getAmount());
    	
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

	@Override
	public void actionForTransaction(int idType, double amount) {
		switch (idType) {
		case 1:
			break;
		case 2:
			break;
		default:
			break;
		}
	}

	@Override
	public Transaction feignFindById(Long id) {
		Optional<Transaction> transactionOptional = repository.findById(id);
		
		if (transactionOptional.isPresent()) {
			Transaction transaction = transactionOptional.get();
			
			Account account = productClient.findById_2(transaction.getAccount());
			Account acc = Optional.ofNullable(account).orElse(new Account());
			transaction.setAccount_main(acc);
			
			return transaction;
		}				
		return null;
	}        
}
