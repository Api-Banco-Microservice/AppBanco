package com.nttdata.abs.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.abs.customer.Service.CustomerService;
import com.nttdata.abs.customer.entity.Customer;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
    
    @Autowired
    private CustomerService service;

    @GetMapping("/findAll")
    public String findAllClient(){
        return null;
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id) {
        return null;
    }

    @PostMapping("/create")
    public String createClient(@RequestBody Customer client) {
        return null;
    }

    @PutMapping("/update/{id}")
    public String updateClient(@PathVariable("id") Long id, @RequestBody Customer client) {
        return null;
    }

}
