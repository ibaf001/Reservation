package org.airline.reservations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SeatTest {

	@Test
	public void testSeat() {
		Seat seat = new Seat();
		assertEquals(10, seat.getSeatNumber());
	}
	
	@Test
	public void testSetSeatNumber(){
		Seat seat = new Seat();
		seat.setSeatNumber(4);
		assertEquals(4, seat.getSeatNumber());
	}

}
