package com.altimetrik.ticketbooking.model;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Data
@Entity
@Table(name="bus_details")
public class BusDetailsEntity {

    @Id
    @Column(name = "bus_id")
    private int busId;

    @Column(name = "bus_number")
    private String busNumber;

    @Column(name = "bus_operator_name")
    private String busOperatorName;

    @Column(name = "bus_arrival_time")
    private LocalDateTime busArrivalTime;

    @Column(name = "bus_departure_time")
    private LocalDateTime busDepartureTime;

    @Column(name = "bus_travel_date")
    private LocalDate travelDate;

    @Column(name = "bus_return_date")
    private LocalDate busReturnDate;

    @Column(name="bus_price")
    private double busPrice;

	
    public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getBusOperatorName() {
		return busOperatorName;
	}

	public void setBusOperatorName(String busOperatorName) {
		this.busOperatorName = busOperatorName;
	}

	public LocalDateTime getBusArrivalTime() {
		return busArrivalTime;
	}

	public void setBusArrivalTime(LocalDateTime busArrivalTime) {
		this.busArrivalTime = busArrivalTime;
	}

	public LocalDateTime getBusDepartureTime() {
		return busDepartureTime;
	}

	public void setBusDepartureTime(LocalDateTime busDepartureTime) {
		this.busDepartureTime = busDepartureTime;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public LocalDate getBusReturnDate() {
		return busReturnDate;
	}

	public void setBusReturnDate(LocalDate busReturnDate) {
		this.busReturnDate = busReturnDate;
	}

	public double getBusPrice() {
		return busPrice;
	}

	public void setBusPrice(double busPrice) {
		this.busPrice = busPrice;
	}

    
    
}
