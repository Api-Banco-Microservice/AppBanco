package com.nttdata.abs.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.abs.product.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
