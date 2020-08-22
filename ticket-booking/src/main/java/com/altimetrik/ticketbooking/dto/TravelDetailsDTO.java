package com.altimetrik.ticketbooking.dto;


import java.io.Serializable;

public class TravelDetailsDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2175994390652972411L;

	private int travelId;

    private String travelSourceCity;

    private String travelDestinationCity;

    private BusDetailsDTO busDetailsEntity;

	public int getTravelId() {
		return travelId;
	}

	public void setTravelId(int travelId) {
		this.travelId = travelId;
	}

	public String getTravelSourceCity() {
		return travelSourceCity;
	}

	public void setTravelSourceCity(String travelSourceCity) {
		this.travelSourceCity = travelSourceCity;
	}

	public String getTravelDestinationCity() {
		return travelDestinationCity;
	}

	public void setTravelDestinationCity(String travelDestinationCity) {
		this.travelDestinationCity = travelDestinationCity;
	}

	public BusDetailsDTO getBusDetailsEntity() {
		return busDetailsEntity;
	}

	public void setBusDetailsEntity(BusDetailsDTO busDetailsEntity) {
		this.busDetailsEntity = busDetailsEntity;
	}
    
    

}
