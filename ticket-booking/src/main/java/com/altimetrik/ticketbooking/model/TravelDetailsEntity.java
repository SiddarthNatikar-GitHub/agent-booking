package com.altimetrik.ticketbooking.model;


import javax.persistence.*;

@Entity
@Table(name="travel_details")
public class TravelDetailsEntity {

    @Id
    @Column(name = "travel_Id")
    private int travelId;

    @Column(name = "travel_Source_City")
    private String travelSourceCity;

    @Column(name = "travel_Destination_City")
    private String travelDestinationCity;

    @ManyToOne(fetch = FetchType.EAGER ,optional = false)
    @JoinColumn(name = "bus_id" ,nullable = false)
    private BusDetailsEntity busDetailsEntity;

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

	public BusDetailsEntity getBusDetailsEntity() {
		return busDetailsEntity;
	}

	public void setBusDetailsEntity(BusDetailsEntity busDetailsEntity) {
		this.busDetailsEntity = busDetailsEntity;
	}
    
    

}
