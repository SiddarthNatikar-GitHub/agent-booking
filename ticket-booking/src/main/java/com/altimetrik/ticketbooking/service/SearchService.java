package com.altimetrik.ticketbooking.service;

import com.altimetrik.ticketbooking.model.TravelDetailsEntity;

import java.util.List;

public interface SearchService {

    List<TravelDetailsEntity> searchBusDetails(String sourceCity,String destCity,
            String travelDate,String retuenDate);
}
