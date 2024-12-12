package com.cbc_order_processing_app.controller;

import com.cbc_order_processing_app.model.entity.Order;
import com.cbc_order_processing_app.model.entity.OrderItem;
import com.cbc_order_processing_app.model.entity.Product;
import com.cbc_order_processing_app.repository.OrderRepository;
import com.cbc_order_processing_app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrderById(@PathVariable Long id) {
        return orderRepository.findById(id);
    }

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        double totalCost = 0.0;
        for (OrderItem item : order.getItems()) {
            totalCost += item.calculateTotalCost();
        }
        order.setStatus("Pending");
        orderRepository.save(order);
        return order;
    }


}
