package com.example.pironeer.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;
    private int amount;

    protected Product() {}

    public Product(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getStockQuantity() { return amount; }

    public void removeAmount(int quantity) {
        if (this.amount < quantity) {
            throw new IllegalStateException("재고 부족");
        }
        this.amount -= quantity;
    }

    public void addAmount(int quantity) {
        this.amount += quantity;
    }
}
