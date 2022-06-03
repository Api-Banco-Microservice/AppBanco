package com.nttdata.abs.customer.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.abs.customer.Service.BussinessCustomerService;
import com.nttdata.abs.customer.entity.BussinessCustomer;
import com.nttdata.abs.customer.repository.BussinessCustomerRepository;

@Service
public class BussinessCustomerServiceImpl implements BussinessCustomerService {

	@Autowired
	private BussinessCustomerRepository bussinessCustomerRepository;

	@Override
	@Transactional(readOnly = true)
	public List<BussinessCustomer> findAll() {
		return (List<BussinessCustomer>) bussinessCustomerRepository.findAll();

	}

	@Override
	public BussinessCustomer findById(Long id) {
		return bussinessCustomerRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public BussinessCustomer save(BussinessCustomer bussinessCustomer) {
		return bussinessCustomerRepository.save(bussinessCustomer);
	}

	@Override
	public BussinessCustomer update(BussinessCustomer bussinessCustomer, Long id) {
		BussinessCustomer bussinessCustomerDB = this.findById(bussinessCustomer.getId());
		if (bussinessCustomer != null) {
			bussinessCustomerDB.setName(bussinessCustomer.getName());
			bussinessCustomerDB.setAddress(bussinessCustomer.getAddress());
			bussinessCustomerDB.setEmail(bussinessCustomer.getEmail());
			bussinessCustomerDB.setState(bussinessCustomer.getState());
			bussinessCustomerDB.setType(bussinessCustomer.getType());
			bussinessCustomerDB.setRuc(bussinessCustomer.getRuc());
		}

		return bussinessCustomerRepository.save(bussinessCustomerDB);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		bussinessCustomerRepository.deleteById(id);

	}

}
