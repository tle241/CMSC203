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

	@Override
	// setSize
	public void setSize(double length, double width) {
		this.length = length;
		this.width = width;
	}

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
	public void setBuildingType(String type) {
		this.buildingType = type;
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
				width);
	}

}
