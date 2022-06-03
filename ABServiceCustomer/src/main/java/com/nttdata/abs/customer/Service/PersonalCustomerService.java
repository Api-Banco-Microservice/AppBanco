package com.nttdata.abs.customer.Service;

import java.util.List;

import com.nttdata.abs.customer.entity.PersonalCustomer;

public interface PersonalCustomerService {

    List<PersonalCustomer> findAll();
    PersonalCustomer findById(Long id);
    PersonalCustomer save(PersonalCustomer personalCustomer);
    PersonalCustomer update(PersonalCustomer personalCustomer, Long id);
    void delete(Long id);
    
}
