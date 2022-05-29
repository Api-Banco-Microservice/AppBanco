package com.nttdata.abs.customer.service.Impl;

import java.util.List;

import com.nttdata.abs.customer.entity.Client;
import com.nttdata.abs.customer.repository.ClientRepository;
import com.nttdata.abs.customer.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository repository;

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
