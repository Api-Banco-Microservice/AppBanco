package com.nttdata.abs.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/findAll")
	public List<Customer> findAllClient() {
		return customerService.findAll();
	}

	@GetMapping("/view/{id}")
	public Customer findById(@PathVariable("id") Long id) {
		return customerService.findById(id);
	}

	@PostMapping("/create")
	public Customer save(@RequestBody Customer client) {
		return customerService.save(client);
	}

	@PutMapping("/update/{id}")
	public Customer update(@PathVariable("id") Long id, @RequestBody Customer client) {
		return customerService.update(client, id);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		customerService.delete(id);
	}

}
