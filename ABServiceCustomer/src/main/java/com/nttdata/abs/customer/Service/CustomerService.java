package com.nttdata.abs.customer.Service;

import java.util.List;

import com.nttdata.abs.customer.entity.Customer;

public interface CustomerService {

    List<Customer> findAll();
    Customer findById(Long id);
    Customer save(Customer customer);
    Customer update(Customer customer, Long id);
    void delete(Long id);
    
}
