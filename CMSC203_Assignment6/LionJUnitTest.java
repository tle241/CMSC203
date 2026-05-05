/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Lion JUnit Test
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

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LionJUnitTest {

	private Lion lion;
	private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void setUp() {
		lion = new Lion("Simba", 5, "African Lion", "Golden", "images/lion.png");
		System.setOut(new PrintStream(outputStream));
	}

	@AfterEach
	public void tearDown() {
		System.setOut(originalOut);
		outputStream.reset();
	}

	@Test
	public void testGetName() {
		assertEquals("Simba", lion.getName());
	}

	@Test
	public void testGetAge() {
		assertEquals(5, lion.getAge());
	}

	@Test
	public void testGetSpecies() {
		assertEquals("African Lion", lion.getSpecies());
	}

	@Test
	public void testGetColor() {
		assertEquals("Golden", lion.getColor());
	}

	@Test
	public void testGetImagePath() {
		assertEquals("images/lion.png", lion.getImagePath());
	}

	@Test
	public void testToString() {
		String expected = "Lion [Name: Simba, Age: 5, Species: African Lion, Color: Golden]";
		assertEquals(expected, lion.toString());
	}

	@Test
	public void testMakeSound() {
		lion.makeSound();
		assertEquals("Roar!" + System.lineSeparator(), outputStream.toString());
	}

	@Test
	public void testMove() {
		lion.move();

		String output = outputStream.toString().replace("\r\n", "\n");

		assertEquals("Runs powerfully.\n", output);
	}
}