package com.nttdata.abs.customer.Service.Impl;

import java.util.List;

import com.nttdata.abs.customer.Service.ClientService;
import com.nttdata.abs.customer.entity.Client;
import com.nttdata.abs.customer.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository repository;

    @Override
    public List<Client> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Client findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Client createClient(Client client) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Client updateClient(Client client) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteClient(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}
