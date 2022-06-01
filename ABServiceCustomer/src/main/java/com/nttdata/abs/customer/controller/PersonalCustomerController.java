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

import com.nttdata.abs.customer.Service.PersonalCustomerService;
import com.nttdata.abs.customer.entity.PersonalCustomer;

@RestController
@RequestMapping("/personalCustomers")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonalCustomerController {

	@Autowired
	private PersonalCustomerService personalCustomerService;

	@GetMapping("/findAll")
	public List<PersonalCustomer> findAllClient() {
		return personalCustomerService.findAll();
	}

	@GetMapping("/view/{id}")
	public PersonalCustomer findById(@PathVariable("id") Long id) {
		return personalCustomerService.findById(id);
	}

	@PostMapping("/create")
	public PersonalCustomer save(@RequestBody PersonalCustomer personalCustomer) {
		return personalCustomerService.save(personalCustomer);
	}

	@PutMapping("/update/{id}")
	public PersonalCustomer update(@PathVariable("id") Long id, @RequestBody PersonalCustomer personalCustomer) {
		return personalCustomerService.update(personalCustomer, id);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		personalCustomerService.delete(id);
	}

}
