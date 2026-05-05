/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Clerk JUnit Test
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

public class ClerkTest {

	private Clerk clerk;

	@BeforeEach
	public void setUp() {
		clerk = new Clerk("Bob", 35, 10, "Ticket Clerk", "images/clerk.png");
	}

	@Test
	public void testGetName() {
		assertEquals("Bob", clerk.getName());
	}

	@Test
	public void testGetAge() {
		assertEquals(35, clerk.getAge());
	}

	@Test
	public void testGetYearsWorked() {
		assertEquals(10, clerk.getYearsWorked());
	}

	@Test
	public void testGetJob() {
		assertEquals("Ticket Clerk", clerk.getJob());
	}

	@Test
	public void testGetImagePath() {
		assertEquals("images/clerk.png", clerk.getImagePath());
	}

	@Test
	public void testToString() {
		String expected = "Clerk - Name: Bob, Age: 35, Job: Ticket Clerk, Years Worked: 10";
		assertEquals(expected, clerk.toString());
	}
}
