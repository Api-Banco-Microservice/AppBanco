package com.nttdata.abs.customer.repository;

import com.nttdata.abs.customer.entity.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
}