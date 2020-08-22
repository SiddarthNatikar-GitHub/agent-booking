package com.altimetrik.ticketbooking.controller;

import com.altimetrik.ticketbooking.model.TravelDetailsEntity;
import com.altimetrik.ticketbooking.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/agent")
public class SearchController {

    @Autowired
    SearchService searchService;

    @GetMapping("/busDetails")
    public List<TravelDetailsEntity> searchBusDetails(@RequestParam  String sourceCity,@RequestParam  String destCity ,
            @RequestParam String travelDate,@RequestParam  String returnDate) {
        return searchService.searchBusDetails(sourceCity,destCity,travelDate,returnDate);
    }

}
