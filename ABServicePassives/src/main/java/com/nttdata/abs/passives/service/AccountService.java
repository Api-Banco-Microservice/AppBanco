package com.nttdata.abs.passives.service;

import java.util.List;

import com.nttdata.abs.passives.entity.Account;

public interface AccountService {

    public abstract List<Account> findAll();
    public abstract Account findById(String id);
    public abstract Account createClient(Account account);
    public abstract Account updateClient(Account account);
    public abstract void deleteClient(String id);

}
