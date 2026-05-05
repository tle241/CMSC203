/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Arena JUnit Test
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

public class ArenaJUnitTest {

	private Arena arena;

	@BeforeEach
	public void setUp() {
		arena = new Arena("Red", 100.0, 50.0, "images/arena.png");
	}

	@Test
	public void testGetColor() {
		assertEquals("Red", arena.getColor());
	}

	@Test
	public void testGetLength() {
		assertEquals(100.0, arena.getLength(), 0.001);
	}

	@Test
	public void testGetWidth() {
		assertEquals(50.0, arena.getWidth(), 0.001);
	}

	@Test
	public void testGetBuildingType() {
		assertEquals("Arena", arena.getBuildingType());
	}

	@Test
	public void testGetImagePath() {
		assertEquals("images/arena.png", arena.getImagePath());
	}

	@Test
	public void testSetSize() {
		arena.setSize(120.0, 60.0);
		assertEquals(120.0, arena.getLength(), 0.001);
		assertEquals(60.0, arena.getWidth(), 0.001);
	}

	@Test
	public void testSetColor() {
		arena.setColor("Blue");
		assertEquals("Blue", arena.getColor());
	}

	@Test
	public void testSetBuildingType() {
		arena.setBuildingType("Big Arena");
		assertEquals("Big Arena", arena.getBuildingType());
	}
}