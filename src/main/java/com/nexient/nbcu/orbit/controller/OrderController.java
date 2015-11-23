package com.nexient.nbcu.orbit.controller;

import com.nexient.nbcu.orbit.model.Orders;
import com.nexient.nbcu.orbit.service.OrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


import javax.transaction.Transactional;
import java.util.Collection;

/**
 * Created by kraichura on 11/16/2015.
 */
@RestController
@RequestMapping("/orbit/order")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;

    private static final Logger logger = Logger.getLogger(OrderController.class);


    @RequestMapping(method = RequestMethod.GET)
    public Collection<Orders> list() {
        return orderService.getOrders();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Orders create(@RequestBody Orders orders) {
        return orderService.saveOrUpdate(orders);
    }

}
