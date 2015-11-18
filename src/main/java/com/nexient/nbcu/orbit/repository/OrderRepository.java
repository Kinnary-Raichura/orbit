package com.nexient.nbcu.orbit.repository;

import com.nexient.nbcu.orbit.model.Orders;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * Created by kraichura on 11/16/2015.
 */
@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

}
