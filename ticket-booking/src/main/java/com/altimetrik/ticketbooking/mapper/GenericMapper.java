package com.altimetrik.ticketbooking.mapper;

import org.springframework.stereotype.Component;

import com.altimetrik.ticketbooking.dto.BusDetailsDTO;
import com.altimetrik.ticketbooking.dto.TravelDetailsDTO;
import com.altimetrik.ticketbooking.model.BusDetailsEntity;
import com.altimetrik.ticketbooking.model.TravelDetailsEntity;

@Component
public class GenericMapper {

    public BusDetailsEntity mapToBusEntity(BusDetailsDTO busDetailsDTO){
    	BusDetailsEntity busDetailsEntity = new BusDetailsEntity(); 
    	busDetailsEntity.setBusId(busDetailsDTO.getBusId());
    	busDetailsEntity.setBusArrivalTime(busDetailsDTO.getBusArrivalTime());
    	busDetailsEntity.setBusDepartureTime(busDetailsDTO.getBusArrivalTime());
    	busDetailsEntity.setBusNumber(busDetailsDTO.getBusNumber());
    	busDetailsEntity.setBusPrice(busDetailsDTO.getBusPrice());
    	busDetailsEntity.setTravelDate(busDetailsDTO.getTravelDate());
    	busDetailsEntity.setBusReturnDate(busDetailsDTO.getBusReturnDate());
    	busDetailsEntity.setBusOperatorName(busDetailsDTO.getBusOperatorName());
    	
        return busDetailsEntity;
    }

    public TravelDetailsEntity mapTravelEntity(TravelDetailsDTO travelDetailsDTO){
    	TravelDetailsEntity travelDetailsEntity = new TravelDetailsEntity();
    	travelDetailsEntity.setTravelDestinationCity(travelDetailsDTO.getTravelDestinationCity());
    	travelDetailsEntity.setTravelId(travelDetailsDTO.getTravelId());
    	travelDetailsEntity.setTravelSourceCity(travelDetailsDTO.getTravelSourceCity());
    	travelDetailsEntity.setBusDetailsEntity(mapToBusEntity(travelDetailsDTO.getBusDetailsEntity()));
    	
        return travelDetailsEntity;
    }

}
