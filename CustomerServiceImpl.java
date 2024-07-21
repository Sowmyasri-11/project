package com.si.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.demo.entity.Customer;
import com.si.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> fetchCustomerList() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer fetchCustomerById(Long customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId).get();
	}


	@Override
	public void deleteCustomerById(Long customerId) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(customerId);
	}

	@Override
	public Customer updateCustomer(Long customerId, Customer customer) {
		// TODO Auto-generated method stub

		Customer customerdata = customerRepository.findById(customerId).get();

	    if(Objects.nonNull(customer.getName()) &&
	    !"".equalsIgnoreCase(customer.getName())) {
	        customerdata.setname(customer.getName());
	    }

	    if(Objects.nonNull(customer.getemail()) &&
	            !"".equalsIgnoreCase(customer.getemail())) {
	       customerdata.setemail(customer.getemail());
	    }
		return customerRepository.save(customerdata);
	

	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
}
