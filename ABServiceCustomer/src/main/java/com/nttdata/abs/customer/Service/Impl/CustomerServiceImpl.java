package com.nttdata.abs.customer.Service.Impl;

import java.util.List;

import com.nttdata.abs.customer.entity.Customer;
import com.nttdata.abs.customer.repository.CustomerRepository;
import com.nttdata.abs.customer.Service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Customer findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Customer createClient(Customer client) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Customer updateClient(Customer client) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteClient(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}
