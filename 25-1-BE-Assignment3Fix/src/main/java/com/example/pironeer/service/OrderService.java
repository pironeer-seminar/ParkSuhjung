package com.example.pironeer.service;

import com.example.pironeer.domain.*;
import com.example.pironeer.domain.OrderRequestItem;
import com.example.pironeer.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public OrderService(OrderRepository orderRepository, UserRepository userRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    public Long createOrder(Long userId, OrderRequestItem requestItem) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Product product = productRepository.findById(requestItem.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.removeAmount(requestItem.getQuantity());

        Order order = new Order(user, product, "ORDERED", requestItem.getQuantity());
        return orderRepository.save(order).getId();
    }

    public void cancelOrder(Long orderId) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));
        order.cancel();
    }

    public List<Order> getOrdersByUserId(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return orderRepository.findByUser(user);
    }
}
