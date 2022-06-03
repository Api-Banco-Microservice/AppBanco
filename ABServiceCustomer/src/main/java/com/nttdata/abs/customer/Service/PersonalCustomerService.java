package com.nttdata.abs.customer.Service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.nttdata.abs.customer.entity.PersonalCustomer;

public interface PersonalCustomerService {

	@Query(value = "select pc from PersonalCustomer pc left join fetch pc.personal_customer")
    public List<PersonalCustomer> findAll();
	@Query(value = "select pc from PersonalCustomer pc left join fetch pc.personal_customer where pc.personal_customer=:id")
    public PersonalCustomer findById(Long id);
    public PersonalCustomer save(PersonalCustomer personalCustomer);
    public PersonalCustomer update(PersonalCustomer personalCustomer, Long id);
    void delete(Long id);
    
}
