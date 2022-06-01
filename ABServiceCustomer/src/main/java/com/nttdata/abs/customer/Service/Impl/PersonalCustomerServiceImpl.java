package com.nttdata.abs.customer.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.abs.customer.Service.PersonalCustomerService;
import com.nttdata.abs.customer.entity.PersonalCustomer;
import com.nttdata.abs.customer.repository.PersonalCustomerRepository;

@Service
public class PersonalCustomerServiceImpl implements PersonalCustomerService {

    @Autowired
    private PersonalCustomerRepository personalCustomerRepository;

    @Override
    @Transactional(readOnly = true)
    public List<PersonalCustomer> findAll() {
       return (List<PersonalCustomer>) personalCustomerRepository.findAll();
    	
    }

    @Override
    public PersonalCustomer findById(Long id) {
        return personalCustomerRepository.findById(id).orElse(null);
    }

	@Override
	@Transactional
	public PersonalCustomer save(PersonalCustomer personalCustomer) {
		return personalCustomerRepository.save(personalCustomer);
	}

	@Override
	public PersonalCustomer update(PersonalCustomer personalCustomer, Long id) {
		PersonalCustomer personalCustomerDB = this.findById(personalCustomer.getId());
		if(personalCustomer==null) {
			return null;
		}
		personalCustomerDB.setLastname(personalCustomer.getLastname());
		personalCustomerDB.setDni(personalCustomer.getDni());
		personalCustomerDB.setAge(personalCustomer.getAge());
		personalCustomerDB.setNroAccount(personalCustomer.getNroAccount());
		personalCustomerDB.setSavingsAccount(personalCustomer.isSavingsAccount());
		personalCustomerDB.setFixedTermAccount(personalCustomer.isFixedTermAccount());
		personalCustomerDB.setCurrentAccount(personalCustomer.isCurrentAccount());
		
		return personalCustomerRepository.save(personalCustomerDB);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		personalCustomerRepository.deleteById(id);
		
	}
    
}
