/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Acrobatic JUnit Test
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

public class AcrobaticTest {

	private Acrobatic acrobatic;

	@BeforeEach
	public void setUp() {
		acrobatic = new Acrobatic("Anna", 24, 4, "Performer", "images/acrobat.png");
	}

	@Test
	public void testGetName() {
		assertEquals("Anna", acrobatic.getName());
	}

	@Test
	public void testGetAge() {
		assertEquals(24, acrobatic.getAge());
	}

	@Test
	public void testGetYearsWorked() {
		assertEquals(4, acrobatic.getYearsWorked());
	}

	@Test
	public void testGetJob() {
		assertEquals("Performer", acrobatic.getJob());
	}

	@Test
	public void testGetImagePath() {
		assertEquals("images/acrobat.png", acrobatic.getImagePath());
	}

	@Test
	public void testToString() {
		String expected = "Acrobatic - Name: Anna, Age: 24, Job: Performer, Years Worked: 4";
		assertEquals(expected, acrobatic.toString());
	}
}