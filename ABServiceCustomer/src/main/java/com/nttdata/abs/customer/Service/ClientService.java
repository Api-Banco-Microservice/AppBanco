package com.nttdata.abs.customer.service;

import java.util.List;

import com.nttdata.abs.customer.entity.Client;

public interface ClientService {

    public abstract List<Client> findAll();
    public abstract Client findById(Long id);
    public abstract Client createClient(Client client);
    public abstract Client updateClient(Client client);
    public abstract void deleteClient(Long id);
    
}
