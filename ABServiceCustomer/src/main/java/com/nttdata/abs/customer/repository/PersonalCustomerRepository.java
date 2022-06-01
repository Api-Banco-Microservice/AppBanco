package com.nttdata.abs.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.abs.customer.entity.PersonalCustomer;

public interface PersonalCustomerRepository extends JpaRepository<PersonalCustomer, Long>{

    
}