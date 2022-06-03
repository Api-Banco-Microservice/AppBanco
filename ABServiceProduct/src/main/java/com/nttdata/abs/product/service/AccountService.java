package com.nttdata.abs.product.service;

import java.util.List;

import com.nttdata.abs.product.entity.Account;

public interface AccountService {

    public abstract List<Account> findAll();
    public abstract Account findById(int id);
    public abstract Account createClient(Account account);
    public abstract Account updateClient(Account account);
    public abstract void deleteClient(int id);

}
