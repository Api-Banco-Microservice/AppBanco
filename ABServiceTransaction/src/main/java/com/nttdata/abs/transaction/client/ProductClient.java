package com.nttdata.abs.transaction.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nttdata.abs.transaction.client.model.Account;

@FeignClient(name = "SERVICE-PRODUCT")
public interface ProductClient {

	@GetMapping("/account/find/{id}")
    public Account findById_2(@PathVariable("id") int id);

}
