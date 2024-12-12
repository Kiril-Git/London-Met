package com.cbc_order_processing_app.model.entity;



import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    private Long productId;
    private String name;
    private String description;
    private String grade;
    private int stockLevel;
    private double price;

    public Product() {}

    public Product(Long productId, String name, String description, String grade, int stockLevel, double price) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.grade = grade;
        this.stockLevel = stockLevel;
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
