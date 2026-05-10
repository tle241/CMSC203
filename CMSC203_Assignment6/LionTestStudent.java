/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: LionTestStudent JUnitTest
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//LionTestStudent: JUnit Test: Created
//Test each constructor
//based on dog junit test file
package BobsCircus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LionTestStudent {
	private Lion lion;
	private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	// setup like dogJUnitTest
	@BeforeEach

	public void setUp() {
		lion = new Lion("SonLam", 3, "lion", "Dark Yellow", "images/lion.png");
		System.setOut(new PrintStream(outputStream));
	}

	@AfterEach
	public void tearDown() {
		System.setOut(originalOut);
		outputStream.reset();
	}

	// test getters

	@Test
	public void testGetName() {
		assertEquals("SonLam", lion.getName());
	}

	@Test
	public void testGetAge() {
		assertEquals(3, lion.getAge());
	}

	@Test
	public void testGetSpecies() {
		assertEquals("lion", lion.getSpecies());
	}

	@Test
	public void testGetColor() {
		assertEquals("Dark Yellow", lion.getColor());
	}

	@Test
	public void testGetImagePath() {
		assertEquals("images/lion.png", lion.getImagePath());
	}

	// test toString
	@Test
	public void testToString() {
		String expected = "Lion[Name: SonLam, Age: 3, Species: lion, Color: Dark Yellow]";
		assertEquals(expected, lion.toString());
	}

	// test makeSound()
	@Test
	public void testMakeSound() {
		lion.makeSound();
		assertEquals("chewing noisily while eating" + System.lineSeparator(), outputStream.toString());
	}

	// testMove()
	@Test
	public void testMove() {
		lion.move();

		String output = outputStream.toString().replace("\r\n", "\n");

		assertEquals("moves around in the Circus stage\n", output);
	}
}

//Author: Tran Minh Chau Le