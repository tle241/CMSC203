/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Bird class implements from Animal Interface
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//Bird: Implement Animal Interface
//Override method
package BobsCircus;

public class Bird implements Animal {
	private String name;
	private int age;
	private String species;
	private String color;
	private String imagePath;

	public Bird(String name, int age, String species, String color, String imagePath) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.color = color;
		this.imagePath = imagePath;
	}

	@Override
	// makeSound()
	public void makeSound() {
		System.out.println("The parrot says: Welcome to the Circus!");
	}

	@Override
	// move()
	public void move() {
		System.out.println("Standing in the bicycle");
	}

	// Getters

	@Override
	// getName()
	public String getName() {
		return name;
	}

	@Override
	// getAge()
	public int getAge() {
		return age;
	}

	@Override
	// getSpecies()
	public String getSpecies() {
		return species;
	}

	@Override
	// getColor()
	public String getColor() {
		return color;
	}

	@Override
	// getImagePath()
	public String getImagePath() {
		return imagePath;
	}

	@Override
	// toString()
	public String toString() {
		return String.format("Bird[Name: %s, Age: %d, Species: %s, Color: %s]", name, age, species, color);
	}
}
//Author: Tran Minh Chau Le