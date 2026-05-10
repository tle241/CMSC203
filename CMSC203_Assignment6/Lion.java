/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Lion class implements from Animal Interface
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//Lion: Implement from Animal Interface Class
//Override method
package BobsCircus;

public class Lion implements Animal {
	private String name;
	private int age;
	private String species;
	private String color;
	private String imagePath;

	public Lion(String name, int age, String species, String color, String imagePath) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.color = color;
		this.imagePath = imagePath;
	}

	@Override
	// makeSound()
	public void makeSound() {
		System.out.println("chewing noisily while eating");

	}

	@Override
	// move()
	public void move() {
		System.out.println("moves around in the Circus stage");
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
		return String.format("Lion[Name: %s, Age: %d, Species: %s, Color: %s]", name, age, species, color);
	}

}

//Author: Tran Minh Chau Le