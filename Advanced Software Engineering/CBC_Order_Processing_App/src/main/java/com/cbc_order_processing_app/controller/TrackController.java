package com.cbc_order_processing_app.controller;

import com.cbc_order_processing_app.model.entity.Order;
import com.cbc_order_processing_app.repository.OrderRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackController {

    private OrderRepository orderRepository;

    public Order trackOrder(@PathVariable Long id) {
        return orderRepository.findById(id).orElse(null);
    }

}
