package com.altimetrik.ticketbooking.dao;

import com.altimetrik.ticketbooking.model.TravelDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TravelDetailsRepository  extends JpaRepository<TravelDetailsEntity,Integer> {

   /* @Query("select travelDetails from TravelDetailsEntity  travelDetails fetch join travelDetails.busDetailsEntity as details  where details.busNumber = :busNumber")
    List<TravelDetailsEntity> findTravelDetailsEntity(@Param("busNumber") String busNumber);*/
    //List<TravelDetailsEntity> findByTravelId(int travelId);
   public List<TravelDetailsEntity> findByTravelSourceCityAndTravelDestinationCityAndBusDetailsEntity_TravelDateAndBusDetailsEntity_busReturnDate( String travelSourceCity , String travelDestinationCity,  LocalDate travelDate, LocalDate busReturnDate);
}
