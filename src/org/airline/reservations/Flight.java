package org.airline.reservations;

public class Flight {

	//fields
	private String departureCity;
	private String arrivalCity;
	private int flightNumber;

	
	public Flight() {
		// TODO Auto-generated constructor stub
		departureCity = "Unknown Departure City";
		arrivalCity = "Unknown Arrival City";
		flightNumber = 100;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

}
