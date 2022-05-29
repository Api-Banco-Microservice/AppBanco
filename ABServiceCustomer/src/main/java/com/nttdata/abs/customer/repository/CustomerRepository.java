package com.nttdata.abs.customer.repository;

import com.nttdata.abs.customer.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}