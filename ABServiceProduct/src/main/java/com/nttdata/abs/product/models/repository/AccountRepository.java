package com.nttdata.abs.product.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.abs.product.models.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}
