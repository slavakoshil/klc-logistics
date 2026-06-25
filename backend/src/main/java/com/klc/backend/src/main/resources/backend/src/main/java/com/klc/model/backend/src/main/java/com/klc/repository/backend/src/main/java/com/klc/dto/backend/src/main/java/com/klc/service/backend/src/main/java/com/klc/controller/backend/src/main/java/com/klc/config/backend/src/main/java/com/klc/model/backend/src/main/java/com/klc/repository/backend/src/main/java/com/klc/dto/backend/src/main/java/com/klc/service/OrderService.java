package com.klc.service;

import com.klc.dto.CreateOrderRequest;
import com.klc.model.Order;
import com.klc.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(CreateOrderRequest request) {

        Order order = new Order();

        order.setLoadingCity(request.getLoadingCity());
        order.setUnloadingCity(request.getUnloadingCity());
        order.setCargoType(request.getCargoType());
        order.setWeight(request.getWeight());
        order.setPhone(request.getPhone());
        order.setComment(request.getComment());

        return orderRepository.save(order);
    }
}
