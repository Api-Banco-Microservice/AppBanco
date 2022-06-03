package com.nttdata.abs.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.abs.customer.Service.BussinessCustomerService;
import com.nttdata.abs.customer.entity.BussinessCustomer;

@RestController
@RequestMapping("/bussinessCustomers")
@CrossOrigin(origins = "http://localhost:4200")
public class BussinessCustomerController {

	@Autowired
	private BussinessCustomerService bussinessCustomerService;

	@GetMapping("/findAll")
	public List<BussinessCustomer> findAllClient() {
		return bussinessCustomerService.findAll();
	}

	@GetMapping(value = "/view/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public BussinessCustomer findById(@PathVariable("id") Long id) {
		return bussinessCustomerService.findById(id);
	}

	@PostMapping(value = "/create", produces = { MediaType.APPLICATION_JSON_VALUE })
	public BussinessCustomer save(@RequestBody BussinessCustomer bussunessCustomer) {
		return bussinessCustomerService.save(bussunessCustomer);
	}

	@PutMapping(value = "/update/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public BussinessCustomer update(@PathVariable("id") Long id, @RequestBody BussinessCustomer bussinessCustomer) {
		return bussinessCustomerService.update(bussinessCustomer, id);
	}

	@DeleteMapping(value = "/delete/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public void delete(@PathVariable Long id) {
		bussinessCustomerService.delete(id);
	}

}
