/*
 * Class: CMSC203 - CRN 30295
 * Instructor: Grigoriy Grinberg
 * Description: PatientDriverAppGUI creates an instance of the Patient class
 *              and three instances of the Procedure class using JavaFX GUI.
 * Due: 02/23/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Tran Minh Chau Le
*/

//import
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//class header
public class PatientDriverAppGUI extends Application {

	// creates an instance of the Patient class
	private Patient patient;

	// create three instances of the Procedure class
	private Procedure procedure1;
	private Procedure procedure2;
	private Procedure procedure3;

	public static void main(String[] args) {
		launch(args);
	}

	// Start method - set up and display GUI, click event
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Patient & Procedure Info");

		// LEFT SIDE: Patient Information (GridPane)
		GridPane patientGrid = new GridPane();
		patientGrid.setHgap(10);
		patientGrid.setVgap(8);
		patientGrid.setPadding(new Insets(10));
		patientGrid.setStyle("-fx-border-color: gray; -fx-border-width: 1;");

		Label patientSectionTitle = new Label("Patient Information");
		patientSectionTitle.setStyle("-fx-font-weight: bold; -fx-font-size: 14;");

		TextField patientFirstNameInput = new TextField();
		TextField patientMiddleNameInput = new TextField();
		TextField patientLastNameInput = new TextField();
		TextField patientAddressInput = new TextField();
		TextField patientCityInput = new TextField();
		TextField patientStateInput = new TextField();
		TextField patientZipInput = new TextField();
		TextField patientPhoneInput = new TextField();
		TextField emergencyNameInput = new TextField();
		TextField emergencyPhoneInput = new TextField();

		// Row 0: title
		patientGrid.add(patientSectionTitle, 0, 0, 2, 1);

		// Row 1-10: Label on column 0, TextField on column 1
		patientGrid.add(new Label("First Name:"), 0, 1);
		patientGrid.add(patientFirstNameInput, 1, 1);

		patientGrid.add(new Label("Middle Name:"), 0, 2);
		patientGrid.add(patientMiddleNameInput, 1, 2);

		patientGrid.add(new Label("Last Name:"), 0, 3);
		patientGrid.add(patientLastNameInput, 1, 3);

		patientGrid.add(new Label("Address:"), 0, 4);
		patientGrid.add(patientAddressInput, 1, 4);

		patientGrid.add(new Label("City:"), 0, 5);
		patientGrid.add(patientCityInput, 1, 5);

		patientGrid.add(new Label("State:"), 0, 6);
		patientGrid.add(patientStateInput, 1, 6);

		patientGrid.add(new Label("ZIP:"), 0, 7);
		patientGrid.add(patientZipInput, 1, 7);

		patientGrid.add(new Label("Phone:"), 0, 8);
		patientGrid.add(patientPhoneInput, 1, 8);

		patientGrid.add(new Label("Emergency Name:"), 0, 9);
		patientGrid.add(emergencyNameInput, 1, 9);

		patientGrid.add(new Label("Emergency Phone:"), 0, 10);
		patientGrid.add(emergencyPhoneInput, 1, 10);

		// Click Save Patient
		Button savePatientButton = new Button("Save Patient");
		patientGrid.add(savePatientButton, 0, 11, 2, 1);

		///////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////

		// RIGHT SIDE: 3 Procedures side by side (HBox of VBoxes)
		// Procedure 1 (VBox)
		TextField procedure1NameInput = new TextField();
		TextField procedure1DateInput = new TextField();
		TextField procedure1PractitionerInput = new TextField();
		TextField procedure1ChargesInput = new TextField();
		Button saveProcedure1Button = new Button("Save Procedure 1");

		VBox procedure1Box = new VBox(8);
		procedure1Box.setPadding(new Insets(10));
		procedure1Box.setStyle("-fx-border-color: gray; -fx-border-width: 1;");

		HBox p1row1 = new HBox(8);
		p1row1.getChildren().addAll(new Label("Name:   "), procedure1NameInput);

		HBox p1row2 = new HBox(8);
		p1row2.getChildren().addAll(new Label("Date:    "), procedure1DateInput);

		HBox p1row3 = new HBox(8);
		p1row3.getChildren().addAll(new Label("Practitioner:"), procedure1PractitionerInput);

		HBox p1row4 = new HBox(8);
		p1row4.getChildren().addAll(new Label("Charge ($):  "), procedure1ChargesInput);

		procedure1Box.getChildren().addAll(new Label("Procedure 1"), p1row1, p1row2, p1row3, p1row4,
				saveProcedure1Button);

		// Procedure 2 (VBox)
		TextField procedure2NameInput = new TextField();
		TextField procedure2DateInput = new TextField();
		TextField procedure2PractitionerInput = new TextField();
		TextField procedure2ChargesInput = new TextField();
		Button saveProcedure2Button = new Button("Save Procedure 2");

		VBox procedure2Box = new VBox(8);
		procedure2Box.setPadding(new Insets(10));
		procedure2Box.setStyle("-fx-border-color: gray; -fx-border-width: 1;");

		HBox p2row1 = new HBox(8);
		p2row1.getChildren().addAll(new Label("Name:        "), procedure2NameInput);

		HBox p2row2 = new HBox(8);
		p2row2.getChildren().addAll(new Label("Date:          "), procedure2DateInput);

		HBox p2row3 = new HBox(8);
		p2row3.getChildren().addAll(new Label("Practitioner:"), procedure2PractitionerInput);

		HBox p2row4 = new HBox(8);
		p2row4.getChildren().addAll(new Label("Charge ($):  "), procedure2ChargesInput);

		procedure2Box.getChildren().addAll(new Label("Procedure 2"), p2row1, p2row2, p2row3, p2row4,
				saveProcedure2Button);

		// Procedure 3 (VBox)
		TextField procedure3NameInput = new TextField();
		TextField procedure3DateInput = new TextField();
		TextField procedure3PractitionerInput = new TextField();
		TextField procedure3ChargesInput = new TextField();
		Button saveProcedure3Button = new Button("Save Procedure 3");

		VBox procedure3Box = new VBox(8);
		procedure3Box.setPadding(new Insets(10));
		procedure3Box.setStyle("-fx-border-color: gray; -fx-border-width: 1;");

		HBox p3row1 = new HBox(8);
		p3row1.getChildren().addAll(new Label("Name:        "), procedure3NameInput);

		HBox p3row2 = new HBox(8);
		p3row2.getChildren().addAll(new Label("Date:         "), procedure3DateInput);

		HBox p3row3 = new HBox(8);
		p3row3.getChildren().addAll(new Label("Practitioner:"), procedure3PractitionerInput);

		HBox p3row4 = new HBox(8);
		p3row4.getChildren().addAll(new Label("Charge ($):  "), procedure3ChargesInput);

		procedure3Box.getChildren().addAll(new Label("Procedure 3"), p3row1, p3row2, p3row3, p3row4,
				saveProcedure3Button);

		// Group 3 procedures into 1 HBox horizontal
		Label proceduresSectionTitle = new Label("Procedures");
		proceduresSectionTitle.setStyle("-fx-font-weight: bold; -fx-font-size: 14;");

		HBox proceduresRow = new HBox(15);
		proceduresRow.setPadding(new Insets(10));
		proceduresRow.getChildren().addAll(procedure1Box, procedure2Box, procedure3Box);

		VBox rightSide = new VBox(10);
		rightSide.setPadding(new Insets(10));
		rightSide.setStyle("-fx-border-color: gray; -fx-border-width: 1;");

		rightSide.getChildren().addAll(proceduresSectionTitle, proceduresRow);

		// TOP: Left + Right combined into BorderPane center
		HBox topSection = new HBox(10);
		topSection.getChildren().addAll(patientGrid, rightSide);

		// BOTTOM: Show Output + Exit buttons + TextArea
		Button showOutputButton = new Button("Show Output");
		Button exitButton = new Button("Exit");

		HBox bottomButtons = new HBox(10);
		bottomButtons.setPadding(new Insets(5));
		bottomButtons.getChildren().addAll(showOutputButton, exitButton);

		TextArea outputDisplayArea = new TextArea();
		outputDisplayArea.setPrefHeight(150);

		VBox bottomSection = new VBox(5);
		bottomSection.getChildren().addAll(bottomButtons, outputDisplayArea);

		// BorderPane: top section + bottom section
		BorderPane mainLayout = new BorderPane();
		mainLayout.setPadding(new Insets(10));
		mainLayout.setCenter(topSection);
		mainLayout.setBottom(bottomSection);

		// Button Events using lambda expressions

		// Event: Click Save Patient
		// creates an instance of the Patient class,
		// initialized with sample data that a user entered from keyboard
		savePatientButton.setOnAction(e -> {
			patient = new Patient(patientFirstNameInput.getText(), patientMiddleNameInput.getText(),
					patientLastNameInput.getText(), patientAddressInput.getText(), patientCityInput.getText(),
					patientStateInput.getText(), patientZipInput.getText(), patientPhoneInput.getText(),
					emergencyNameInput.getText(), emergencyPhoneInput.getText());
			outputDisplayArea.setText("Patient saved.\n");
		});

		// Event: Click Save Procedure 1
		// Make sure to create each instance using one of each constructor
		// (using the constructor that initializes all attributes)
		saveProcedure1Button.setOnAction(e -> {
			double chargeAmount = Double.parseDouble(procedure1ChargesInput.getText());
			procedure1 = new Procedure(procedure1NameInput.getText(), procedure1DateInput.getText(),
					procedure1PractitionerInput.getText(), chargeAmount);
			outputDisplayArea.appendText("Procedure 1 saved.\n");
		});

		// Event: Click Save Procedure 2
		// Note that if you create an instance using constructors other than the one
		// that
		// initializes all attributes, you must set the values of all attributes.
		// (using the constructor that initializes procedure's name and date, then
		// setters)
		saveProcedure2Button.setOnAction(e -> {
			double chargeAmount = Double.parseDouble(procedure2ChargesInput.getText());
			procedure2 = new Procedure(procedure2NameInput.getText(), procedure2DateInput.getText());
			procedure2.setPractitionerName(procedure2PractitionerInput.getText());
			procedure2.setCharges(chargeAmount);
			outputDisplayArea.appendText("Procedure 2 saved.\n");
		});

		// Event: Click Save Procedure 3
		// Note that if you create an instance using constructors other than the one
		// that
		// initializes all attributes, you must set the values of all attributes.
		// (using the no-arg constructor, then setters for all attributes)
		saveProcedure3Button.setOnAction(e -> {
			double chargeAmount = Double.parseDouble(procedure3ChargesInput.getText());
			procedure3 = new Procedure();
			procedure3.setProcedureName(procedure3NameInput.getText());
			procedure3.setProcedureDate(procedure3DateInput.getText());
			procedure3.setPractitionerName(procedure3PractitionerInput.getText());
			procedure3.setCharges(chargeAmount);
			outputDisplayArea.appendText("Procedure 3 saved.\n");
		});

		// Event: Click Show Output
		showOutputButton.setOnAction(e -> {
			outputDisplayArea.clear();

			// The program should display the patient's information
			outputDisplayArea.appendText(displayPatient(patient) + "\n\n");

			// information about all three of the procedures
			outputDisplayArea.appendText(displayProcedure(procedure1) + "\n");
			outputDisplayArea.appendText(displayProcedure(procedure2) + "\n");
			outputDisplayArea.appendText(displayProcedure(procedure3) + "\n\n");

			// the total charges of the three procedures displayed in comma separated with
			// two decimal points.
			double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
			outputDisplayArea.appendText("Total Charges: $" + String.format("%,.2f", totalCharges) + "\n\n");

			// Display a message: The program was developed by a Student: <Name> <07/27/24>
			outputDisplayArea.appendText("The program was developed by a Student: Tran Le 02/23/2026");
		});

		// Event: Exit button closes the window
		exitButton.setOnAction(e -> {
			primaryStage.close();
		});

		// Creating Scene
		Scene scene = new Scene(mainLayout, 980, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// The class should have the following methods:

	// displayPatient: This method given a patient object will display patient's
	// information.
	public String displayPatient(Patient patient) {
		if (patient == null) {
			return "";
		}
		return patient.toString();
	}

	// displayProcedure: This method given a procedure object will display
	// procedure's information.
	public String displayProcedure(Procedure procedure) {
		if (procedure == null) {
			return "";
		}
		return procedure.toString();
	}

	/*
	 * calculateTotalCharges: this method takes three procedures as parameter and
	 * returns the total charges of these procedures.
	 */
	public double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		double total = 0.0;
		if (procedure1 != null) {
			total = total + procedure1.getCharges();
		}
		if (procedure2 != null) {
			total = total + procedure2.getCharges();
		}
		if (procedure3 != null) {
			total = total + procedure3.getCharges();
		}
		return total;
	}
}
