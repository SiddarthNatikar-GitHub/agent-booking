package com.altimetrik.ticketbooking.controller;

import com.altimetrik.ticketbooking.dto.TravelDetailsDTO;
import com.altimetrik.ticketbooking.mapper.GenericMapper;
import com.altimetrik.ticketbooking.dao.BusDetailsRepository;
import com.altimetrik.ticketbooking.dao.TravelDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agent")
public class AdminController {

    @Autowired
    private BusDetailsRepository busDetailsRepository;

    @Autowired
    private TravelDetailsRepository travelDetailsRepository;

    @Autowired
    private GenericMapper mapper;

    @PostMapping("/admin")
    public TravelDetailsDTO addBusDetails(@RequestBody TravelDetailsDTO travelDetailsDTO){
        busDetailsRepository.save(mapper.mapToBusEntity(travelDetailsDTO.getBusDetailsEntity()));
        travelDetailsRepository.save(mapper.mapTravelEntity(travelDetailsDTO));

      //  travelDetailsRepository.fetchBusTravelDTOLeftJoin();
        return travelDetailsDTO;
    }
}
