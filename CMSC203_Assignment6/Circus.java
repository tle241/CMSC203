package BobsCircus;
import java.util.ArrayList;
import java.util.List;

public class Circus {
	private List<Animal> animals;
	private List<Person> persons;
	private List<Building> buildings;

	public Circus() {
		animals = new ArrayList<>();
		persons = new ArrayList<>();
		buildings = new ArrayList<>();
	}

	// Add building
	public void addBuilding(Building building) {
		buildings.add(building);
	}

	// Display all buildings
	public void displayAllBuildings() {
		if (buildings.isEmpty()) {
			System.out.println("No buildings in the circus.");
			return;
		}

		for (Building building : buildings) {
			System.out.println(building);
		}
	}

	// Add person
	public void addPerson(Person person) {
		persons.add(person);
	}

	// Display all persons
	public void displayAllPersons() {
		if (persons.isEmpty()) {
			System.out.println("No persons in the circus.");
			return;
		}

		for (Person person : persons) {
			System.out.println(person);
		}
	}

	// Add animal
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	// Display all animals
	public void displayAllAnimals() {
		if (animals.isEmpty()) {
			System.out.println("No animals in the circus.");
			return;
		}

		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}

	// Selection sort to sort animals by age
	public void sortAnimalsByAge() {
		for (int i = 0; i < animals.size() - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < animals.size(); j++) {
				if (animals.get(j).getAge() < animals.get(minIndex).getAge()) {
					minIndex = j;
				}
			}

			Animal temp = animals.get(i);
			animals.set(i, animals.get(minIndex));
			animals.set(minIndex, temp);
		}
	}

	// Selection sort to sort animals by name
	public void sortAnimalsByName() {
		for (int i = 0; i < animals.size() - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < animals.size(); j++) {
				if (animals.get(j).getName().compareToIgnoreCase(animals.get(minIndex).getName()) < 0) {
					minIndex = j;
				}
			}

			Animal temp = animals.get(i);
			animals.set(i, animals.get(minIndex));
			animals.set(minIndex, temp);
		}
	}

	// Search for an animal by name
	public Animal searchAnimalByName(String name) {
		for (Animal animal : animals) {
			if (animal.getName().equalsIgnoreCase(name)) {
				return animal;
			}
		}
		return null;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

}