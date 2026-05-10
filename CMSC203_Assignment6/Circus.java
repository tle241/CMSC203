/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Circus class is used to display, add, sort, and search
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

package BobsCircus;

import java.util.ArrayList;
import java.util.List;

//Add, display: animal, person, building, ticket
//Sort animals: age, name
//Search animals: name
//Override methods

public class Circus {
	private List<Animal> animals;
	private List<Person> persons;
	private List<Building> buildings;

	public Circus() {
		animals = new ArrayList<>();
		persons = new ArrayList<>();
		buildings = new ArrayList<>();
	}
	
	//getters
	// circus.getAnimals();
	public List<Animal> getAnimals(){
		return animals;
	}
	
	// circus.getPersons();
	public List<Person> getPersons(){
		return persons;
	}
	
	// circus.getBuildings();
	public List<Building> getBuildings(){
		return buildings;
	}
	// Add + Display

	// Add building
	public void addBuilding(Building building) {
		buildings.add(building);
	}

	// Display all buildings
	// for loop
	public void displayAllBuildings() {
		for (int i = 0; i < buildings.size(); i++) {
			// Take the building in this position
			Building thisBuilding = buildings.get(i);

			// print
			System.out.println(thisBuilding);

		}
	}

	// Add person
	public void addPerson(Person person) {
		persons.add(person);
	}

	// Display all persons
	// loop
	public void displayAllPersons() {
		for (int i = 0; i < persons.size(); i++) {
			// Take the person in this position
			Person thisPerson = persons.get(i);

			// print
			System.out.println(thisPerson);

		}
	}

	// Add animal
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	// Display all animals
	// loop
	public void displayAllAnimals() {
		for (int i = 0; i < animals.size(); i++) {
			// Take the animal in this position
			Animal thisAnimal = animals.get(i);

			// print
			System.out.println(thisAnimal);

		}
	}

	// Selection sort to sort animals by age
	// youngest->oldest
	public void sortAnimalsByAge() {
		// nested for loop
		for (int i = 0; i < animals.size() - 1; i++) {
			int youngest = i;
			// for
			for (int j = i + 1; j < animals.size(); j++) {
				int thisAge = animals.get(j).getAge();
				int youngestAge = animals.get(youngest).getAge();

				if (thisAge < youngestAge) {
					// Update the position of the animal based on its age
					youngest = j;
				}
			}
			// swap
			// step1: put in tempt
			Animal tempt = animals.get(youngest);

			// step2:take animal in i position]
			Animal firstAnimal = animals.get(i);

			// step3: Change to the first position: youngest
			animals.set(youngest, firstAnimal);

			// step4: take animal in tempt var into position i
			animals.set(i, tempt);

		}
	}

	// Selection sort to sort animals by name
	// Alphabet
	public void sortAnimalsByName() {
		// nested for loop
		for (int i = 0; i < animals.size() - 1; i++) {
			// based on alphabet a->z; in i position
			int firstIndexName = i;
			// for
			for (int j = i + 1; j < animals.size(); j++) {
				String thisName = animals.get(j).getName();
				String firstName = animals.get(firstIndexName).getName();

				if (thisName.compareToIgnoreCase(firstName) < 0) {
					// Update the position of the animal based on its name
					firstIndexName = j;
				}
			}
			// swap
			// step1: put in tempt
			Animal tempt = animals.get(firstIndexName);

			// step2:take animal in i position]
			Animal firstAnimal = animals.get(i);

			// step3: Change to the first position: alphabet
			animals.set(firstIndexName, firstAnimal);

			// step4: take animal in tempt var into position i
			animals.set(i, tempt);

		}
	}

	// Search for an animal by name
	public Animal searchAnimalsByName(String name) {
		// loop
		for (int i = 0; i < animals.size(); i++) {
			// find by name
			// step1: take animal at i position
			Animal thisAnimal = animals.get(i);

			// step2: Take out the name
			String thisName = thisAnimal.getName();

			// step3:check name
			if (thisName.equalsIgnoreCase(name)) {
				return thisAnimal;
			}

		}
		return null;
	}
}

//Author: Tran Minh Chau Le