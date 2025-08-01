package com.postion.airlineorderbackend.service;

import com.postion.airlineorderbackend.dto.OrderDto;
import com.postion.airlineorderbackend.model.OrderStatus;
import java.util.List;

public interface OrderService {

    List<OrderDto> getAllOrders();

    OrderDto getOrderById(Long id);

    OrderDto payOrder(Long id);

    OrderDto cancelOrder(Long id);

    OrderDto updateOrderStatus(Long id, OrderStatus status);
}