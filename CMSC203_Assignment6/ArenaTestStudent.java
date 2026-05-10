/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: ArenaTestStudent JUnitTest
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//ArenaTestStudent: JUnit Test: Created
//Test each constructor

package BobsCircus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArenaTestStudent {
	private Arena arena;

	// setup like dogJUnitTest
	@BeforeEach

	public void setUp() {
		arena = new Arena("Red and Orange", 105.5, 102.2, "images/arena.png");

	}

	// test getters

	@Test
	public void testGetColor() {
		assertEquals("Red and Orange", arena.getColor());
	}

	@Test
	public void testGetLength() {
		assertEquals(105.5, arena.getLength());
	}

	@Test
	public void testGetWidth() {
		assertEquals(102.2, arena.getWidth());
	}

	@Test
	public void testGetBuildingType() {
		assertEquals("Arena", arena.getBuildingType());
	}

	@Test
	public void testGetImagePath() {
		assertEquals("images/arena.png", arena.getImagePath());
	}

	// test toString
	@Test
	public void testToString() {
		String expected = "\nBuilding Type: Arena \nColor: Red and Orange \nSize: 105.5 x 102.2\n";
		assertEquals(expected, arena.toString());
	}
}
//Author: Tran Minh Chau Le