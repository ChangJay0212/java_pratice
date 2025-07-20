package com.example.onlinestore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    // DTO for creating an order
    public static class OrderRequest {
        public String customerName;
        public List<OrderItemRequest> items;
    }

    public static class OrderItemRequest {
        public Long productId;
        public int quantity;
    }

    @PostMapping
    @Transactional // Ensure all DB operations in this method are atomic
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest orderRequest) {
        Order order = new Order();
        order.setCustomerName(orderRequest.customerName);

        List<OrderItem> orderItems = orderRequest.items.stream().map(itemRequest -> {
            Product product = productRepository.findById(itemRequest.productId)
                    .orElseThrow(() -> new RuntimeException("Product not found with id: " + itemRequest.productId));

            OrderItem orderItem = new OrderItem();
            orderItem.setProduct(product);
            orderItem.setQuantity(itemRequest.quantity);
            orderItem.setPrice(product.getPrice()); // Set price from product
            orderItem.setOrder(order); // Link back to the order
            return orderItem;
        }).collect(Collectors.toList());

        order.setItems(orderItems);

        double totalAmount = orderItems.stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
        order.setTotalAmount(totalAmount);

        Order savedOrder = orderRepository.save(order);
        return ResponseEntity.ok(savedOrder);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        return orderRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
