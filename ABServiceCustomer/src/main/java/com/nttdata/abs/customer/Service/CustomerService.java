package com.nttdata.abs.customer.Service;

import java.util.List;

import com.nttdata.abs.customer.entity.Customer;

public interface CustomerService {

	public List<Customer> findAll();
    public Customer findById(Long id);
    public Customer save(Customer customer);
    public Customer update(Customer customer, Long id);
    public void delete(Long id);
    
}
