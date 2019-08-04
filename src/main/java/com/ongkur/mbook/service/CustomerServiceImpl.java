package com.ongkur.mbook.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.ongkur.mbook.domain.Customer;
import com.ongkur.mbook.exception.CustomerNotFoundException;
import com.ongkur.mbook.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	private final CustomerRepository customerRepository;	

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer findCustomerById(Long id) {
		// TODO Auto-generated method stub
		
		return customerRepository.findById(id)
				.orElseThrow(() -> new CustomerNotFoundException(id));		
	}

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}
	
	@Override
	public Customer update(Long id, Customer newCustomer) {
		
		return customerRepository.findById(id)
			.map(customer -> {
				customer.setFirstName(newCustomer.getFirstName());
				customer.setLastName(newCustomer.getLastName());
				return customerRepository.save(customer);
			})
			.orElseGet(() -> {
				newCustomer.setId(id);
				return customerRepository.save(newCustomer);
			});
				
	}
	
	@Override
	public void delete(Long id) {
		customerRepository.deleteById(id);
	}
}