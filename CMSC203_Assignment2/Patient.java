/*
 * Class: CMSC203 - CRN 30295
 * Instructor: Grigoriy Grinberg
 * Description: The Patient class represents a patient and stores their personal
 *              information, address, and emergency contact details.
 * Due: 02/23/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Tran Minh Chau Le
*/

//class header
public class Patient {

	// Patient name information
	// First name, middle name, and last name
	private String firstName;
	private String middleName;
	private String lastName;

	// Street Address, city, state, and ZIP code
	private String streetAddress;
	private String city;
	private String state;
	private String zip;

	// Phone number (example 301-123-4567)
	private String phone;

	// Name and phone number of emergency contact
	private String emergencyName;
	private String emergencyPhone;

	// no-arg constructor
	public Patient() {
		firstName = "";
		middleName = "";
		lastName = "";
		streetAddress = "";
		city = "";
		state = "";
		zip = "";
		phone = "";
		emergencyName = "";
		emergencyPhone = "";
	}

	// a parametrized constructor name
	public Patient(String givenFirstName, String givenMiddleName, String givenLastName) {
		firstName = givenFirstName;
		middleName = givenMiddleName;
		lastName = givenLastName;
		streetAddress = "";
		city = "";
		state = "";
		zip = "";
		phone = "";
		emergencyName = "";
		emergencyPhone = "";
	}

	// // a parametrized constructor name and all attributes
	public Patient(String givenFirstName, String givenMiddleName, String givenLastName, String givenStreetAddress,
			String givenCity, String givenState, String givenZip, String givenPhone, String givenEmergencyName,
			String givenEmergencyPhone) {
		firstName = givenFirstName;
		middleName = givenMiddleName;
		lastName = givenLastName;
		streetAddress = givenStreetAddress;
		city = givenCity;
		state = givenState;
		zip = givenZip;
		phone = givenPhone;
		emergencyName = givenEmergencyName;
		emergencyPhone = givenEmergencyPhone;
	}

	// accessor for each attribute + return
	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmergencyName() {
		return emergencyName;
	}

	public String getEmergencyPhone() {
		return emergencyPhone;
	}

	// mutator for each attribute
	public void setFirstName(String givenFirstName) {
		firstName = givenFirstName;
	}

	public void setMiddleName(String givenMiddleName) {
		middleName = givenMiddleName;
	}

	public void setLastName(String givenLastName) {
		lastName = givenLastName;
	}

	public void setStreetAddress(String givenStreetAddress) {
		streetAddress = givenStreetAddress;
	}

	public void setCity(String givenCity) {
		city = givenCity;
	}

	public void setState(String givenState) {
		state = givenState;
	}

	public void setZip(String givenZip) {
		zip = givenZip;
	}

	public void setPhone(String givenPhone) {
		phone = givenPhone;
	}

	public void setEmergencyName(String givenEmergencyName) {
		emergencyName = givenEmergencyName;
	}

	public void setEmergencyPhone(String givenEmergencyPhone) {
		emergencyPhone = givenEmergencyPhone;
	}

	// a method name buildFullName
	// returns first, middle, last name with space

	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}

	// a method named buildAddress
	// returns address, city, state, zip with space
	public String buildAddress() {
		return streetAddress + " " + city + " " + state + " " + zip;
	}

	// a method named buildEmergencyContact
	// returns emergency name and phone
	public String buildEmergencyContact() {
		return emergencyName + " " + emergencyPhone;
	}

	// a toString method
	// display all patient information
	// using buildFullName, buildAddress,
	// buildEmergencyContact

	public String toString() {
		return "Patient Name: " + buildFullName() + "\n" + "Address: " + buildAddress() + "\n" + "Phone number: "
				+ phone + "\n" + "Emergency Contact: " + buildEmergencyContact();
	}
}
