package com.nttdata.abs.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.abs.customer.Service.CustomerService;
import com.nttdata.abs.customer.entity.Customer;

@RefreshScope
@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@GetMapping("/findAll")
	public List<Customer> findAllClient() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Customer findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}

	@PostMapping("/create")
	public Customer save(@RequestBody Customer client) {
		return service.save(client);
	}

	@PutMapping("/update/{id}")
	public Customer update(@PathVariable("id") Long id, @RequestBody Customer client) {
		return service.update(client, id);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
