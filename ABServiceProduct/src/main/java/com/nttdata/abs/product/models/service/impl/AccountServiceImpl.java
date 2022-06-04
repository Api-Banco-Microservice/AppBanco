package com.nttdata.abs.product.models.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.nttdata.abs.product.models.entity.Account;
import com.nttdata.abs.product.models.repository.AccountRepository;
import com.nttdata.abs.product.models.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository repository;

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		List<Account> returnList = new ArrayList<>();
		repository.findAll().forEach(obj -> returnList.add(obj));
		return returnList;
	}

	@Override
	public Account findById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Account> obj = repository.findById(id.toString());
		if(obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

	@Override
	public Account createClient(Account account) {
		// TODO Auto-generated method stub
		return repository.save(account);
	}

	@Override
	public Account updateClient(Account account) {
		// TODO Auto-generated method stub
		return repository.save(account);
	}

	@Override
	public void deleteClient(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
