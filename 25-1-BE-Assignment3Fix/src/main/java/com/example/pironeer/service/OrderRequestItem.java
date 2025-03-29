package com.example.pironeer.domain;

public class OrderRequestItem {
    private Long productId;
    private int quantity;

    public OrderRequestItem(Long productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}
