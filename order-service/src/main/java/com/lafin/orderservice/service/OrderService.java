package com.lafin.orderservice.service;

import com.lafin.orderservice.dto.OrderDto;
import com.lafin.orderservice.repository.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
