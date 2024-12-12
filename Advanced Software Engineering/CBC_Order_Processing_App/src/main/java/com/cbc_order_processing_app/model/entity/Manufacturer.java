package com.cbc_order_processing_app.model.entity;


import jakarta.persistence.*;

@Entity
public class Manufacturer {
    @Id
    private String manufacturerId;
    private String name;
    private String address;

    public Manufacturer() {}

    public Manufacturer(String manufacturerId, String name, String address) {
        this.manufacturerId = manufacturerId;
        this.name = name;
        this.address = address;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
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
}

