package com.nttdata.abs.customer.Service;

import java.util.List;

import com.nttdata.abs.customer.entity.PersonalCustomer;

public interface PersonalCustomerService {

    public List<PersonalCustomer> findAll();
    public PersonalCustomer findById(Long id);
    public PersonalCustomer save(PersonalCustomer personalCustomer);
    public PersonalCustomer update(PersonalCustomer personalCustomer, Long id);
    void delete(Long id);
    
}
