/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: ClerkTestStudent JUnitTest
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//ClerkTestStudent: JUnit Test: Created
//Test each constructor
//based on dog junit test

package BobsCircus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClerkTestStudent {
	private Clerk clerk;

	// setup like dogJUnitTest
	@BeforeEach

	public void setUp() {
		clerk = new Clerk("Park Jimin", 25, 4, "ticket clerk", "images/clerk.png");
		// System.setOut(new PrintStream(outputStream));
	}

	// test getters

	@Test
	public void testGetName() {
		assertEquals("Park Jimin", clerk.getName());
	}

	@Test
	public void testGetAge() {
		assertEquals(25, clerk.getAge());
	}

	@Test
	public void testGetYearsWorked() {
		assertEquals(4, clerk.getYearsWorked());
	}

	@Test
	public void testGetJob() {
		assertEquals("ticket clerk", clerk.getJob());
	}

	@Test
	public void testGetImagePath() {
		assertEquals("images/clerk.png", clerk.getImagePath());
	}

	// test toString
	@Test
	public void testToString() {
		String expected = "Clerk - Name: Park Jimin, Age: 25, Job: ticket clerk, Years Worked: 4";
		assertEquals(expected, clerk.toString());
	}
}
//Author: Tran Minh Chau Le