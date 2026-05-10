/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Clerk class extends from the abstract class Person.
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//Clerk: Extends the abstract class Person
//Override toString method

//Concepts: 
//	class, inheritance, polymorphism, overriding methods, aggregation

package BobsCircus;

public class Clerk extends Person {

	public Clerk(String name, int age, int yearsWorked, String job, String imagePath) {
		// constructor
		// call super class Person
		// inheritance
		super(name, age, yearsWorked, job, imagePath);
	}

	@Override
	public String toString() {
		return "Clerk - " + super.toString();
	}
}

//Author: Tran Minh Chau Le