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

//fields: name, taxId, properties, propertyCount
//methods: constructor, copy constructor, addProperty, totalRent, getPropertyCount, toString
//constraints: Max 5 properties, deep copy for each copy constructor

//addProperty: adds a property to the array, returns index or -1 if full
//totalRent: sums rent amounts of all properties
//toString: returns string representation of company and properties   
public class ManagementCompany {
	private String name;
	private String taxId;
	private Property[] properties;
	private int propertyCount;
	public static final int MAX_PROPERTIES = 5;
	// keyword static: this var for class itself, every new obj create, var in
	// there.

	// Parameterized constructor
	// int propertyCount
	public ManagementCompany(String name, String taxId) {
		this.name = name;
		this.taxId = taxId;
		properties = new Property[MAX_PROPERTIES];
		// dataType[] arrayName=new dataType[size];
		// this.propertyCount = propertyCount;=>NO
		this.propertyCount = 0;
	}

	// Deep copy constructor
	public ManagementCompany(ManagementCompany other) {
		// if (other != null) {
		this.name = other.name;
		this.taxId = other.taxId;
		this.propertyCount = other.propertyCount;
		this.properties = new Property[MAX_PROPERTIES];
		for (int i = 0; i < other.propertyCount; i++) {
			// 1st iteration i=0
			// properties[0]=new Property(other.properties[0]

			// 2nd iteration i=1
			// properties[1]=new Property(other.properties
			this.properties[i] = new Property(other.properties[i]);
		}
	}

//	}

//Add property
	public int addProperty(Property p) {
		if (propertyCount >= MAX_PROPERTIES) {
			return -1; // array full
		}
		properties[propertyCount] = new Property(p); // copy constructor
		propertyCount++;
		return propertyCount - 1; // return index of added property
	}

	// total rent calculate
	public double totalRent() {
		double total = 0.0;
		for (int i = 0; i < propertyCount; i++) {
			total = total + properties[i].getRentAmount();
		}
		return total;
	}

	// property count
	public int getPropertyCount() {
		return propertyCount;
	}

	// Property name
	public String getName() {
		return name;
	}

	// Property taxId
	public String getTaxId() {
		return taxId;
	}

	public Property getProperty(int index) {
		if (index < 0 || index >= propertyCount) {
			return null;
		}
		return properties[index];
	}

	@Override
	public String toString() {
		String result = "Management Company: " + name + "\nTax ID: " + taxId + "\n\nProperties:\n";

		for (int i = 0; i < propertyCount; i++) {
			result = result + properties[i].toString() + "\n";
		}
		result += "\nTotal Rent: $" + totalRent();
		return result;
	}
}
//Author: Tran Minh Chau Le