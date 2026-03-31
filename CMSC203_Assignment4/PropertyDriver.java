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

public class PropertyDriver {
//Create a management company 3 properties with given details
	public static void main(String[] args) {
		// Creates a ManagementCompany, adds several Property objects, and prints the
		// company information.
		ManagementCompany company = new ManagementCompany("My World Property", "TX12345");
		Property p1 = new Property("Lakewood", "Silver Spring", 1500.0, "Christie");
		Property p2 = new Property("Green Park", "Rockville", 1200.00, "Akina");
		Property p3 = new Property("Sunset Apt", "Bethesda", 800.0, "Tran");

		company.addProperty(p1);
		company.addProperty(p2);
		company.addProperty(p3);

		System.out.println(company);

	}
}
//Author: Tran Minh Chau Le