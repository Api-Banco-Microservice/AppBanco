package com.nttdata.abs.passives.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.abs.passives.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}
