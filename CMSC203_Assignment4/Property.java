/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: This program implements a Property Management application. It includes a Property class to represent individual rental properties, a ManagementCompany class that uses aggregation to manage an array of Property objects, a console-based driver (PropertyDriver), a JavaFX GUI (PropertyAppFX), and JUnit tests. The application need to add properties, calculates total rent, and shows copy constructors and arrays of objects.
 * Due: 03/30/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;

	// Constructor
	// Default constructor
	public Property() {
		propertyName = "";
		city = "";
		rentAmount = 0.0;
		owner = "";
	}

	// Parameterized constructor

	public Property(String name, String city, double rentAmount, String owner) {
		this.propertyName = name;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}

	// Deep Copy constructor
	public Property(Property other) {
		this.propertyName = other.propertyName;
		this.city = other.city;
		this.rentAmount = other.rentAmount;
		this.owner = other.owner;
	}

	// Getter
	public String getPropertyName() {
		return propertyName;
	}

	public String getCity() {
		return city;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public String getOwner() {
		return owner;
	}

	// Setter
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;

	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	// toString Method
	@Override
	public String toString() {
		return "Property Name: " + propertyName + ", City: " + city + ", Rent: $" + rentAmount + ", Owner: " + owner;
	}

}
//Author: Tran Minh Chau Le