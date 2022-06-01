package com.nttdata.abs.customer.Service;

import java.util.List;

import com.nttdata.abs.customer.entity.Customer;

public interface CustomerService {

    List<Customer> findAll();
    Customer findById(Long id);
    Customer save(Customer client);
    Customer update(Customer client, Long id);
    void delete(Long id);
    
}
