package com.ongkur.mbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ongkur.mbook.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
