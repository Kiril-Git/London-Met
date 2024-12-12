package com.cbc_order_processing_app.repository;

import com.cbc_order_processing_app.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
