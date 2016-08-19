package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlightTest {

	@Test
	public void testFlight() {
		Flight flight = new Flight();
		assertEquals("Unknown Departure City", flight.getDepartureCity());
		assertEquals("Unknown Arrival City", flight.getArrivalCity());
		assertEquals(100, flight.getFlightNumber());
	}
	@Test
	public void testSetDepartureCity(){
		Flight flight = new Flight();
		flight.setDepartureCity("Kinshasa");
		assertEquals("Kinshasa", flight.getDepartureCity());
		
	}
	@Test
	public void testArrivalCity(){
		Flight flight = new Flight();
		flight.setArrivalCity("Athens");
		assertEquals("Athens", flight.getArrivalCity());
		
	}
	@Test
	public void testFlightNumber(){
		Flight flight = new Flight();
		flight.setFlightNumber(1409);
		assertEquals(1409, flight.getFlightNumber());
		
	}

}
