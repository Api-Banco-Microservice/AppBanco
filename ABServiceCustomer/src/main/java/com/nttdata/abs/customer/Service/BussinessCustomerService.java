package com.nttdata.abs.customer.Service;

import java.util.List;

import com.nttdata.abs.customer.entity.BussinessCustomer;

public interface BussinessCustomerService {

    List<BussinessCustomer> findAll();
    BussinessCustomer findById(Long id);
    BussinessCustomer save(BussinessCustomer bussinessCustomer);
    BussinessCustomer update(BussinessCustomer bussinessCustomer, Long id);
    void delete(Long id);
    
}
