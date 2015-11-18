package com.nexient.nbcu.orbit.service;

import com.nexient.nbcu.orbit.model.Orders;
import com.nexient.nbcu.orbit.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kraichura on 11/16/2015.
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Orders saveOrUpdate(Orders orders){
        return orderRepository.save(orders);
    }

    public List<Orders> getOrders(){
        return orderRepository.findAll();
    }
}
