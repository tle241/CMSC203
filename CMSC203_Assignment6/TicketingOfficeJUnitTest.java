/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Ticketing Office JUnit Test
 * Due: 05/04/2026
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

package BobsCircus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketingOfficeJUnitTest {

	private TicketingOffice office;

	@BeforeEach
	public void setUp() {
		office = new TicketingOffice("Yellow", 20.0, 10.0, "images/ticket.png");
	}

	@Test
	public void testGetColor() {
		assertEquals("Yellow", office.getColor());
	}

	@Test
	public void testGetLength() {
		assertEquals(20.0, office.getLength(), 0.001);
	}

	@Test
	public void testGetWidth() {
		assertEquals(10.0, office.getWidth(), 0.001);
	}

	@Test
	public void testGetBuildingType() {
		assertEquals("Ticketing Office", office.getBuildingType());
	}

	@Test
	public void testGetImagePath() {
		assertEquals("images/ticket.png", office.getImagePath());
	}

	@Test
	public void testSetSize() {
		office.setSize(25.0, 15.0);
		assertEquals(25.0, office.getLength(), 0.001);
		assertEquals(15.0, office.getWidth(), 0.001);
	}

	@Test
	public void testSetColor() {
		office.setColor("Green");
		assertEquals("Green", office.getColor());
	}

	@Test
	public void testSetBuildingType() {
		office.setBuildingType("Office");
		assertEquals("Office", office.getBuildingType());
	}
}