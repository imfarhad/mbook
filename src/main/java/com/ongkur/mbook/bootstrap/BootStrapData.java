package com.ongkur.mbook.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ongkur.mbook.domain.Customer;
import com.ongkur.mbook.repositories.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	private final CustomerRepository customerRepository;
		
	public BootStrapData(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Loading Customer Data");
		
		Customer c1 = new Customer();
		c1.setFirstName("Fakhrul");
		c1.setLastName("Farhad");
		customerRepository.save(c1);
		
		Customer c2 = new Customer();
		c2.setFirstName("Tania");
		c2.setLastName("Azad");
		customerRepository.save(c2);

		Customer c3 = new Customer();
		c3.setFirstName("Umaiza");
		c3.setLastName("Ushoshi");
		customerRepository.save(c3);
		
		System.out.println("Customer Saved: "+customerRepository.count());
	}
}
