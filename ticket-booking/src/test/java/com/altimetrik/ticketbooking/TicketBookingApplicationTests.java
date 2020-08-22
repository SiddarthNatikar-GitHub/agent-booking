package com.altimetrik.ticketbooking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.altimetrik.ticketbooking.dao.TravelDetailsRepository;
import com.altimetrik.ticketbooking.model.BusDetailsEntity;
import com.altimetrik.ticketbooking.model.TravelDetailsEntity;
import com.altimetrik.ticketbooking.service.SearchServiceImpl;
import static org.mockito.Mockito.when;
@SpringBootTest
class TicketBookingApplicationTests {

	@Mock
	private TravelDetailsRepository repository;

	private List<TravelDetailsEntity> travelDetailsEntityList;

	@InjectMocks
	private SearchServiceImpl searchService;

	@BeforeEach
	public void init() {
		BusDetailsEntity busDetailsEntity = new BusDetailsEntity();
				busDetailsEntity.setTravelDate(LocalDate.parse("2020-08-23"));
				busDetailsEntity.setBusReturnDate(LocalDate.parse("2020-08-24"));
				busDetailsEntity.setBusArrivalTime(LocalDateTime.parse("2020-08-23T08:00:00"));
				busDetailsEntity.setBusDepartureTime(LocalDateTime.parse("2020-08-23T08:15:00"));
				busDetailsEntity.setBusNumber("KA28-R4582");
				busDetailsEntity.setBusOperatorName("Siddarth");
				busDetailsEntity.setBusPrice(1000);
		TravelDetailsEntity travelDetailsEntity = new TravelDetailsEntity();
		travelDetailsEntity.setBusDetailsEntity(busDetailsEntity);
		travelDetailsEntity.setTravelSourceCity("bijapur");
		travelDetailsEntity.setTravelDestinationCity("Bangalore");
		travelDetailsEntity.setTravelId(123);
		travelDetailsEntityList  = new ArrayList<>();
		travelDetailsEntityList.add(travelDetailsEntity);
	}

	@Test
	public void testSearchResultPostive(){
		when(repository.findByTravelSourceCityAndTravelDestinationCityAndBusDetailsEntity_TravelDateAndBusDetailsEntity_busReturnDate
				("bijapur","Bangalore",LocalDate.parse("2020-08-23"),
						LocalDate.parse("2020-08-24"))).thenReturn(travelDetailsEntityList);
		List<TravelDetailsEntity> travels = searchService.searchBusDetails("bijapur","Bangalore","2020-08-23","2020-08-24");
		assertEquals(1, travels.size());
	}

	@Test
	public void testSearchResultNegative(){
		when(repository.findByTravelSourceCityAndTravelDestinationCityAndBusDetailsEntity_TravelDateAndBusDetailsEntity_busReturnDate
				("bijapur","Bangalore",LocalDate.parse("2020-08-23"),
						LocalDate.parse("2020-08-23"))).thenReturn(travelDetailsEntityList);
		List<TravelDetailsEntity> travels = searchService.searchBusDetails("bijapur","Bangalore","2020-08-23","2020-08-24");
		assertEquals(0, travels.size());
	}

}
