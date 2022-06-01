package com.nttdata.abs.customer.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.abs.customer.Service.CustomerService;
import com.nttdata.abs.customer.entity.Customer;
import com.nttdata.abs.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAll() {
       return (List<Customer>) customerRepository.findAll();
    	
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

	@Override
	@Transactional
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer update(Customer customer, Long id) {
		Customer customerDB = this.findById(customer.getId());
		if(customerDB==null) {
			return null;
		}
		customerDB.setName(customer.getName());
		customerDB.setAddress(customer.getAddress());
		customerDB.setEmail(customer.getEmail());
		customerDB.setState(customer.getState());
		customerDB.setType(customer.getType());
		
		return customerRepository.save(customerDB);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		customerRepository.deleteById(id);
		
	}
    
}
