package com.nttdata.abs.transaction.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "SERVICE-PRODUCT")
@RequestMapping("/account")
public interface ProductClient {

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") String id);

}
