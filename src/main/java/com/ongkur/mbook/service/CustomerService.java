package com.ongkur.mbook.service;

import java.util.List;

import com.ongkur.mbook.domain.Customer;

public interface CustomerService {
	Customer findCustomerById(Long id);
	List<Customer> findAllCustomers();
	Customer saveCustomer(Customer customer);
	Customer update(Long id, Customer customer);
	void delete(Long id);
}
