package com.cbc_order_processing_app.repository;


import com.cbc_order_processing_app.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

