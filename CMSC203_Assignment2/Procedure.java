/*
 * Class: CMSC203 - CRN 30295
 * Instructor: Grigoriy Grinberg
 * Description: The Procedure class represents a medical procedure that has
 *              been performed on a patient.
 * Due:02/23/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Tran Minh Chau Le
*/

//class header
// Store medical procedure information
public class Procedure {

	// Procedure fields: Name, Date, Practitioner, Charges
	// Name of the procedure
	private String procedureName;

	// Date of the procedure (for example 06/12/2023)
	private String procedureDate;

	// Name of the practitioner who performed the procedure.
	private String practitionerName;

	// Charges for the procedure
	private double charges;

	// The Procedure class should have:
	// a no-arg constructor
	public Procedure() {
		procedureName = "";
		procedureDate = "";
		practitionerName = "";
		charges = 0.0;
	}

	// a parametrized constructor (name and date)
	public Procedure(String givenProcedureName, String givenProcedureDate) {
		procedureName = givenProcedureName;
		procedureDate = givenProcedureDate;
		practitionerName = "";
		charges = 0.0;
	}

	// a parametrized constructor (all attributes)
	public Procedure(String givenProcedureName, String givenProcedureDate, String givenPractitionerName,
			double givenCharges) {
		procedureName = givenProcedureName;
		procedureDate = givenProcedureDate;
		practitionerName = givenPractitionerName;
		charges = givenCharges;
	}

	// accessor
	public String getProcedureName() {
		return procedureName;
	}

	public String getProcedureDate() {
		return procedureDate;
	}

	public String getPractitionerName() {
		return practitionerName;
	}

	public double getCharges() {
		return charges;
	}

	// a mutator for each attribute
	public void setProcedureName(String givenProcedureName) {
		procedureName = givenProcedureName;
	}

	public void setProcedureDate(String givenProcedureDate) {
		procedureDate = givenProcedureDate;
	}

	public void setPractitionerName(String givenPractitionerName) {
		practitionerName = givenPractitionerName;
	}

	public void setCharges(double givenCharges) {
		charges = givenCharges;
	}

	// a toString method that display all information of a procedure

	public String toString() {
		// information about all three of the procedures, each procedure is displayed
		// tab separated.
		return procedureName + "\t" + procedureDate + "\t" + practitionerName + "\t" + String.format("%.2f", charges);
	}
}
