/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: BirdTestStudent JUnitTest
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//BirdTestStudent: JUnit Test: Created
//Test each constructor

package BobsCircus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BirdTestStudent {
	private Bird bird;
	private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	// setup like dogJUnitTest
	@BeforeEach

	public void setUp() {
		bird = new Bird("Lunlun", 3, "parrot", "Blue and Yellow", "images/bird.png");
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
		assertEquals("Lunlun", bird.getName());
	}

	@Test
	public void testGetAge() {
		assertEquals(3, bird.getAge());
	}

	@Test
	public void testGetSpecies() {
		assertEquals("parrot", bird.getSpecies());
	}

	@Test
	public void testGetColor() {
		assertEquals("Blue and Yellow", bird.getColor());
	}

	@Test
	public void testGetImagePath() {
		assertEquals("images/bird.png", bird.getImagePath());
	}

	// test toString
	@Test
	public void testToString() {
		String expected = "Bird[Name: Lunlun, Age: 3, Species: parrot, Color: Blue and Yellow]";
		assertEquals(expected, bird.toString());
	}

	// test makeSound()
	@Test
	public void testMakeSound() {
		bird.makeSound();
		assertEquals("The parrot says: Welcome to the Circus!" + System.lineSeparator(), outputStream.toString());
	}

	// testMove()
	@Test
	public void testMove() {
		bird.move();

		String output = outputStream.toString().replace("\r\n", "\n");

		assertEquals("Standing in the bicycle\n", output);
	}
}

//Author: Tran Minh Chau Le