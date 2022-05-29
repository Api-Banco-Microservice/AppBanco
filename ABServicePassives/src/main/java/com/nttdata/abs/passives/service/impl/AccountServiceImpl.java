package com.nttdata.abs.passives.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.abs.passives.entity.Account;
import com.nttdata.abs.passives.repository.AccountRepository;
import com.nttdata.abs.passives.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository repository;

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account createClient(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account updateClient(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient(String id) {
		// TODO Auto-generated method stub
		
	}

}
