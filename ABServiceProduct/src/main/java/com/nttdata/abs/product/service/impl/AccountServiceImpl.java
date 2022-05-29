package com.nttdata.abs.product.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.nttdata.abs.product.entity.Account;
import com.nttdata.abs.product.repository.AccountRepository;
import com.nttdata.abs.product.service.AccountService;

@Service
public abstract class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository repository;

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		List<Account> returnList = new ArrayList<>();
		getAccount().findAll().forEach(obj -> returnList.add(obj));
		return null;
	}

	@Override
	public Account findById(String id) {
		// TODO Auto-generated method stub
		Optional<Account> obj = getAccount().findById(id);
		if(obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

	@Override
	public Account createClient(Account account) {
		// TODO Auto-generated method stub
		return getAccount().save(account);
	}

	@Override
	public Account updateClient(Account account) {
		// TODO Auto-generated method stub
		return getAccount().save(account);
	}

	@Override
	public void deleteClient(String id) {
		// TODO Auto-generated method stub
		getAccount().deleteById(id);
	}
	public abstract CrudRepository<Account, String> getAccount();

}
