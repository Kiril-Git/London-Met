package com.cbc_order_processing_app.model.entity;

import jakarta.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Customer {
    @Id
    private String customerId;
    private String name;
    private String address;

    @ElementCollection
    private Map<String, String> contacts = new HashMap<>();

    public Customer() {}

    public Customer(String customerId, String name, String address, Map<String, String> contacts) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.contacts = new HashMap<>(contacts);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<String, String> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, String> contacts) {
        this.contacts = new HashMap<>(contacts);
    }
}
