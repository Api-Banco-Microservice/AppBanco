package com.nttdata.abs.passives.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.abs.passives.entity.Account;
import com.nttdata.abs.passives.service.AccountService;

@RestController
@RequestMapping("/account")
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {

	@Autowired
	private AccountService service;
	

    @GetMapping("/findAll")
    public String findAllAccounts(){
        return null;
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") String id) {
        return null;
    }

    @PostMapping("/create")
    public String createAccount(@RequestBody Account account) {
        return null;
    }

    @PutMapping("/update/{id}")
    public String updateAccount(@PathVariable("id") String id, @RequestBody Account account) {
        return null;
    }
	
}
