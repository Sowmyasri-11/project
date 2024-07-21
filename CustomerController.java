package com.si.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.demo.entity.Customer;
import com.si.demo.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer) {
       
        return customerService.save(customer);
        
	}
	
	@GetMapping("/customers")
	public List<Customer> fetchCustomerList() {
	    //LOGGER.info("Inside fetchItemList of ItemController");
	    return customerService.fetchCustomerList();
}
	@GetMapping("/customers/{id}")
	public Customer fetchCustomerById(@PathVariable("id") Long customerId)
	        {
	    return customerService.fetchCustomerById(customerId);
	}
	@PutMapping("/customers/{id}")
	public Customer updateCustomer(@PathVariable("id") Long customerId,
	                                   @RequestBody Customer customer) {
	    return customerService.updateCustomer(customerId,customer);
	}

	
	@DeleteMapping("/customers/{id}")
	public String deleteCustomerById(@PathVariable("id") Long customerId) {
	    customerService.deleteCustomerById(customerId);
	    return " deleted Successfully!!";
	}
	
}
