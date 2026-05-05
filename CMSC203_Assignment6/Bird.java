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
		System.out.println("Chirp!");
	}

	@Override
	// move()
	public void move() {
		System.out.println("Flies in the sky.");
	}

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
		return String.format("Bird [Name: %s, Age: %d, Species: %s, Color: %s]", name, age, species, color);
	}

}
