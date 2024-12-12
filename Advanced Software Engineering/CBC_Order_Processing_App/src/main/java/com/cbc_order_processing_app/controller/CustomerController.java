package com.cbc_order_processing_app.controller;

import com.cbc_order_processing_app.model.entity.Customer;
import com.cbc_order_processing_app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository CustomerRepository;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return CustomerRepository.findAll();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return CustomerRepository.save(customer);
    }

}
