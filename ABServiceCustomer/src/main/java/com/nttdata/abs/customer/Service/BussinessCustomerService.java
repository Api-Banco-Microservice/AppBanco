package com.nttdata.abs.customer.Service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.nttdata.abs.customer.entity.BussinessCustomer;

public interface BussinessCustomerService {

	@Query(value = "select bc from BussinesCustomer bc left join fetch bc.bussiness_customer")
    public List<BussinessCustomer> findAll();
	@Query(value = "select bc from BussinessCustomer bc left join fetch bc.bussiness_customer where bc.bussiness_customer=:id")
    public BussinessCustomer findById(Long id);
    public BussinessCustomer save(BussinessCustomer bussinessCustomer);
    public BussinessCustomer update(BussinessCustomer bussinessCustomer, Long id);
    void delete(Long id);
    
}
