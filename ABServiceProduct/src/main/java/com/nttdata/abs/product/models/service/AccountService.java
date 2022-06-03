package com.nttdata.abs.product.models.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.nttdata.abs.product.models.entity.Account;

@Repository
//@Service
//@Component
public interface AccountService {

    public abstract List<Account> findAll();
    public abstract Account findById(Integer id);
    public abstract Account createClient(Account account);
    public abstract Account updateClient(Account account);
    public abstract void deleteClient(String id);

}
