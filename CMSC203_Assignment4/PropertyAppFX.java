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

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PropertyAppFX extends Application {

	private ManagementCompany company = new ManagementCompany("Dream Homes", "TX12345");

	@Override
	public void start(Stage stage) {

//		nameField.setPromptText("Property Name");
//		cityField.setPromptText("City");
//		rentField.setPromptText("Rent");
//		ownerField.setPromptText("Owner");
//		TextArea outputArea = new TextArea();

		Label nameLabel = new Label("Property Name:");
		Label cityLabel = new Label("City:");
		Label rentLabel = new Label("Rent:");
		Label ownerLabel = new Label("Owner:");

		TextField nameField = new TextField();
		TextField cityField = new TextField();
		TextField rentField = new TextField();
		TextField ownerField = new TextField();

		TextArea outputArea = new TextArea();
		outputArea.setPrefHeight(220);
		outputArea.setEditable(false);

		Button addButton = new Button("Add Property");
		Button showAllButton = new Button("Show All Properties");
		Button totalButton = new Button("Show Total Rent");

		// Button 1: Add property
		// addButton = new Button("Add Property");

		addButton.setOnAction(e -> {
			try {
				String name = nameField.getText();
				String city = cityField.getText();
				double rent = Double.parseDouble(rentField.getText());
				String owner = ownerField.getText();

				Property p = new Property(name, city, rent, owner);

				int result = company.addProperty(p);
				if (result == -1) {
					outputArea.setText("Cannot add more properties. Array is full");

				} else {
					outputArea.setText("Property added at index " + result + ".");
				}
			} catch (NumberFormatException ex) {
				outputArea.setText("Error: Rent must be a number ");
			}
		});

		// Button 2: Show all properties
		// showAllButton = new Button("Show All Properties");
		showAllButton.setOnAction(e -> {
			outputArea.setText(company.toString());
		});

		// Button 3: Calculate Rent
		// totalButton = new Button("Calculate Total Rent");
		totalButton.setOnAction(e -> {

			outputArea.appendText("\nTotal Rent = $" + company.totalRent() + "\n");
		});

		// layout
		// VBox layout = new VBox(10, nameField, cityField, rentField, ownerField,
		// addButton, showAllButton, totalButton,
		// outputArea);
		GridPane formPane = new GridPane();
		formPane.setVgap(15);
		formPane.setHgap(15);

		formPane.add(nameLabel, 0, 0);
		formPane.add(nameField, 1, 0);

		formPane.add(cityLabel, 0, 1);
		formPane.add(cityField, 1, 1);

		formPane.add(rentLabel, 0, 2);
		formPane.add(rentField, 1, 2);

		formPane.add(ownerLabel, 0, 3);
		formPane.add(ownerField, 1, 3);
		HBox buttonBox = new HBox(10);
		buttonBox.getChildren().addAll(addButton, showAllButton, totalButton);

		VBox root = new VBox(15);
		root.setPadding(new Insets(20));
		root.getChildren().addAll(formPane, buttonBox, outputArea);
		Scene scene = new Scene(root, 500, 500);

		stage.setTitle("Property Management App");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
//Author: Tran Minh Chau Le