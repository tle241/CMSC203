/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: TicketingOfficeTestStudent JUnitTest
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//TicketingOfficeTestStudent: JUnit Test: Created
//Test each constructor

package BobsCircus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicketingOfficeTestStudent {
	private TicketingOffice ticketingOffice;

	// setup like dogJUnitTest
	@BeforeEach

	public void setUp() {
		ticketingOffice = new TicketingOffice("Dark Blue and Red", 200.5, 200.0, "images/ticketingOffice.png");

	}

	// test getters

	@Test
	public void testGetColor() {
		assertEquals("Dark Blue and Red", ticketingOffice.getColor());
	}

	@Test
	public void testGetLength() {
		assertEquals(200.5, ticketingOffice.getLength());
	}

	@Test
	public void testGetWidth() {
		assertEquals(200.0, ticketingOffice.getWidth());
	}

	@Test
	public void testGetBuildingType() {
		assertEquals("Ticketing Office", ticketingOffice.getBuildingType());
	}

	@Test
	public void testGetImagePath() {
		assertEquals("images/ticketingOffice.png", ticketingOffice.getImagePath());
	}

	// test toString
	@Test
	public void testToString() {
		String expected = "\nBuilding Type: Ticketing Office \nColor: Dark Blue and Red \nSize: 200.5 x 200.0\n";
		assertEquals(expected, ticketingOffice.toString());
	}
}
//Author: Tran Minh Chau Le