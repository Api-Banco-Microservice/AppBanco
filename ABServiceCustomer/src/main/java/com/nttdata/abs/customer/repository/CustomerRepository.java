package com.nttdata.abs.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.abs.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

    
}