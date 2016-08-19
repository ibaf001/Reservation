package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassengerTest {

	@Test
	public void testPassenger() {
		Passenger p = new Passenger();
		String result = p.getName();
		assertEquals("Unknown Name", result);
	}

	@Test
	public void testSetName() {
		//fail("Not yet implemented");
		Passenger p = new Passenger();
		p.setName("mwika");
		assertEquals("mwika",p.getName());
	}

}
