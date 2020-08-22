package com.altimetrik.ticketbooking.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class BusDetailsDTO implements Serializable {
    
	private static final long serialVersionUID = 3503003800644617120L;

    private int busId;

    private String busNumber;

    private String busOperatorName;

    private LocalDateTime busArrivalTime;

    private LocalDateTime busDepartureTime;

    private LocalDate travelDate;

    private LocalDate busReturnDate;

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
