package com.nexient.nbcu.orbit.controller;

import com.nexient.nbcu.orbit.model.Deal;
import com.nexient.nbcu.orbit.model.Orders;
import com.nexient.nbcu.orbit.service.DealService;
import com.nexient.nbcu.orbit.service.OrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by kraichura on 11/20/2015.
 */
@RestController
@CrossOrigin

@RequestMapping("/orbit/deal")
public class DealController {
    @Autowired
    private DealService dealService;

    private static final Logger logger = Logger.getLogger(OrderController.class);


    @RequestMapping(method = RequestMethod.GET)
    public Collection<Deal> list() {
        return dealService.getDeal();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Deal create(@RequestBody Deal deal) {
        return dealService.saveOrUpdate(deal);
    }

}
