package com.nttdata.abs.customer.Service;

import java.util.List;

import com.nttdata.abs.customer.entity.Customer;

public interface CustomerService {

    public abstract List<Customer> findAll();
    public abstract Customer findById(Long id);
    public abstract Customer createClient(Customer client);
    public abstract Customer updateClient(Customer client);
    public abstract void deleteClient(Long id);
    
}
