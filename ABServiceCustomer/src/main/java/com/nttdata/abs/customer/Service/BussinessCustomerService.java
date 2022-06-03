package com.nttdata.abs.customer.Service;

import java.util.List;

import com.nttdata.abs.customer.entity.BussinessCustomer;

public interface BussinessCustomerService {

    public List<BussinessCustomer> findAll();
    public BussinessCustomer findById(Long id);
    public BussinessCustomer save(BussinessCustomer bussinessCustomer);
    public BussinessCustomer update(BussinessCustomer bussinessCustomer, Long id);
    public void delete(Long id);
    
}
