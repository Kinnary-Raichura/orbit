package com.nexient.nbcu.orbit.repository;

import com.nexient.nbcu.orbit.model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kraichura on 11/20/2015.
 */
@Repository
public interface DealRepository extends JpaRepository<Deal, Long> {
}
