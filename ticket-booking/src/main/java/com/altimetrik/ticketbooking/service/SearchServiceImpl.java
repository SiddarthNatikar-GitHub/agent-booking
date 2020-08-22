package com.altimetrik.ticketbooking.service;

import com.altimetrik.ticketbooking.model.TravelDetailsEntity;
import com.altimetrik.ticketbooking.dao.TravelDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService{

    @Autowired
    TravelDetailsRepository travelDetailsRepository;

    @Override
    public List<TravelDetailsEntity> searchBusDetails(String sourceCity, String destCity, String travelDate,
            String returnDate) {

        List<TravelDetailsEntity>  searchResult = travelDetailsRepository.findByTravelSourceCityAndTravelDestinationCityAndBusDetailsEntity_TravelDateAndBusDetailsEntity_busReturnDate
                (sourceCity,destCity, LocalDate.parse(travelDate),LocalDate.parse(returnDate));

        return searchResult;
    }
}
