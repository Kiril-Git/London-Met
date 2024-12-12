package com.cbc_order_processing_app.service;

import com.cbc_order_processing_app.model.entity.Order;
import com.cbc_order_processing_app.model.entity.Product;
import com.cbc_order_processing_app.repository.OrderRepository;
import com.cbc_order_processing_app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    public boolean validateAndPlaceOrder(Order order) {
        boolean allProductsAvailable = order.getItems().stream().allMatch(item -> {
            Product product = productRepository.findById(item.getProduct().getProductId()).orElse(null);
            return product != null && product.getStockLevel() >= item.getQuantity();
        });

        if (!allProductsAvailable) {
            return false;
        }

        order.getItems().forEach(item -> {
            Product product = productRepository.findById(item.getProduct().getProductId()).orElse(null);
            if (product != null) {
                product.setStockLevel(product.getStockLevel() - item.getQuantity());
                productRepository.save(product);
            }
        });

        orderRepository.save(order);
        return true;
    }
}
