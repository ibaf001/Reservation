/* Passenger.java
 * Written by Ibo
 * We will keep the passenger as simple
 * as possible and assume that all 
 * passenger names are unique.
 */
package org.airline.reservations;

public class Passenger {
	//fields
	private String name;
	
	//constructor
	public Passenger() {
		this.name = "Unknown Name";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		
		return "Passenger : "+ this.getName();
	}

}
