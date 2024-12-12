package com.cbc_order_processing_app.repository;

import com.cbc_order_processing_app.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
