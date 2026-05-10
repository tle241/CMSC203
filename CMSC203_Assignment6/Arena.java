/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Arena Implement from Building Interface
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//Arena: Implement from Building Interface class
//Override methods
package BobsCircus;

public class Arena implements Building {
	// instance variables
	private String color;
	private double length;
	private double width;
	private String buildingType;
	private String imagePath;

	// constructor
	public Arena(String color, double length, double width, String imagePath) {
		this.color = color;
		this.length = length;
		this.width = width;
		this.buildingType = "Arena";
		this.imagePath = imagePath;
	}

	// Override methods

	@Override
	public void setSize(double length, double width) {
		// length
		this.length = length;

		// width
		this.width = width;
	}

	// setters and getters
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
	// setColor()
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	// getColor()
	public String getColor() {
		return color;
	}

	@Override
	// setBuildingType()
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	@Override
	// getBuildingType()
	public String getBuildingType() {
		return buildingType;
	}

	@Override
	public String getImagePath() {
		return imagePath;
	}

	@Override
	public String toString() {
		return String.format("\nBuilding Type: %s \nColor: %s \nSize: %.1f x %.1f\n", buildingType, color, length,
				width); // Provided
	}
}

//Author: Tran Minh Chau Le