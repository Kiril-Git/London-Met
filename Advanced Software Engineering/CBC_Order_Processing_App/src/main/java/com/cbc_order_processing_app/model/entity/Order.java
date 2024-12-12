package com.cbc_order_processing_app.model.entity;


import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Order {
    @Id
    private Long orderId;

    @ManyToOne
    private Customer customer;

    private Date orderDate;
    private String status;
    private String deliveryMethod;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items;

    @ManyToOne
    private Staff shippingAgent;

    public Order() {}

    public Order(Long orderId, Customer customer, Date orderDate, String status, String deliveryMethod, List<OrderItem> items, Staff shippingAgent) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
        this.status = status;
        this.deliveryMethod = deliveryMethod;
        this.items = items;
        this.shippingAgent = shippingAgent;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Staff getShippingAgent() {
        return shippingAgent;
    }

    public void setShippingAgent(Staff shippingAgent) {
        this.shippingAgent = shippingAgent;
    }
}
