/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: AcrobaticTestStudent JUnitTest
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//AcrobaticTestStudent: JUnit Test: Created
//Test each constructor

package BobsCircus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AcrobaticTestStudent {
	private Acrobatic acrobatic;

	// setup like dogJUnitTest
	@BeforeEach

	public void setUp() {
		acrobatic = new Acrobatic("Ji Sukjin", 55, 12, "ticket Acrobatic", "images/acrobatic.png");

	}

	// test getters

	@Test
	public void testGetName() {
		assertEquals("Ji Sukjin", acrobatic.getName());
	}

	@Test
	public void testGetAge() {
		assertEquals(55, acrobatic.getAge());
	}

	@Test
	public void testGetYearsWorked() {
		assertEquals(12, acrobatic.getYearsWorked());
	}

	@Test
	public void testGetJob() {
		assertEquals("ticket Acrobatic", acrobatic.getJob());
	}

	@Test
	public void testGetImagePath() {
		assertEquals("images/acrobatic.png", acrobatic.getImagePath());
	}

	// test toString
	@Test
	public void testToString() {
		String expected = "Acrobatic - Name: Ji Sukjin, Age: 55, Job: ticket Acrobatic, Years Worked: 12";
		assertEquals(expected, acrobatic.toString());
	}
}
//Author: Tran Minh Chau Le