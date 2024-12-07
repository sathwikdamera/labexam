package com.klef.jfsd.exam.repository;

import com.klef.jfsd.exam.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // You can add custom query methods here if needed
    // For example, to find a customer by email, you could write:
    // Optional<Customer> findByEmail(String email);
}
