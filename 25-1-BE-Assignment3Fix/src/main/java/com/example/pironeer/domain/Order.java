package com.example.pironeer.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;

    private String status;
    private int amount;

    protected Order() {}

    public Order(User user, Product product, String status, int amount) {
        this.user = user;
        this.product = product;
        this.status = status;
        this.amount = amount;
    }

    public Long getId() { return id; }
    public Product getProduct() { return product; }
    public int getQuantity() { return amount; }
    public String getStatus() { return status; }

    public void cancel() {
        if (this.status.equals("CANCELED")) {
            throw new IllegalStateException("이미 취소된 주문입니다");
        }
        this.status = "CANCELED";
        this.product.addAmount(this.amount);
    }
}