package com.altimetrik.ticketbooking.dao;

import com.altimetrik.ticketbooking.model.BusDetailsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusDetailsRepository extends CrudRepository<BusDetailsEntity,Integer> {
}
