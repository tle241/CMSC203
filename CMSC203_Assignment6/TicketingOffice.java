/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: TicketingOffice Implement from Building Interface
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//TicketingOffice: Implement from Building Interface class
//Override methods
//Have prompt in the Description File
package BobsCircus;

public class TicketingOffice implements Building {
	// instance variables
	private String color;
	private double length;
	private double width;
	private String buildingType;
	private String imagePath;

	// constructor
	public TicketingOffice(String color, double length, double width, String imagePath) {
		this.color = color;
		this.length = length;
		this.width = width;
		this.buildingType = "Ticketing Office";
		this.imagePath = imagePath;
	}

	// Override methods

	@Override
	// setSize
	public void setSize(double length, double width) {
		// length
		this.length = length;

		// width
		this.width = width;
	}

	// getters, setters
	@Override
	// getLength()
	public double getLength() {
		return length;
	}

	@Override
	// getWidth()
	public double getWidth() {
		return width;
	}

	@Override
	// setColor(String color)
	public void setColor(String color) {
		this.color = color;

	}

	@Override
	// getColor()
	public String getColor() {
		return color;
	}

	@Override
	// setBuildingType(String type)
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	@Override
	// getBuildingType()
	public String getBuildingType() {
		return buildingType;
	}

	@Override
	// getImagePath()
	public String getImagePath() {
		return imagePath;
	}

	@Override
	// toString()
	public String toString() {
		return String.format("\nBuilding Type: %s \nColor: %s \nSize: %.1f x %.1f\n", buildingType, color, length,
				width); // format like Arena
	}

}
//Author: Tran Minh Chau Le