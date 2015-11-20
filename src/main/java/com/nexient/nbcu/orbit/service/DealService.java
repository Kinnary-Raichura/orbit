package com.nexient.nbcu.orbit.service;

import com.nexient.nbcu.orbit.model.Deal;
import com.nexient.nbcu.orbit.repository.DealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kraichura on 11/20/2015.
 */
@Service
public class DealService {
    @Autowired
    private DealRepository dealRepository;

    public Deal saveOrUpdate(Deal deal){
        return dealRepository.save(deal);
    }

    public List<Deal> getDeal(){
        return dealRepository.findAll();
    }
}
