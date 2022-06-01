package com.nttdata.abs.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.abs.customer.entity.BussinessCustomer;

public interface BussinessCustomerRepository extends JpaRepository<BussinessCustomer, Long>{

    
}