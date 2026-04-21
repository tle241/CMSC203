/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Reads store sales data from a text file and writes a formatted
 * sales summary to an output file
 * Due: 04/20/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//file input/output helper
public final class SalesFileIO {

	private SalesFileIO() {

	}

	// Reads sales data from a text file and stores it in a ragged 2D array.
	// @param filename name of the input file
	// @return ragged 2D array of doubles
	// @throws IOException if file cannot be opened
	public static double[][] readSalesData(String filename) throws FileNotFoundException {
		ArrayList<double[]> rows = new ArrayList<>();

		// try {
		Scanner inputFile = new Scanner(new File(filename));

		while (inputFile.hasNextLine()) {
			String line = inputFile.nextLine().trim();

			if (line.isEmpty()) {
				continue;
			}

			String[] values = line.split("\\s+");
			double[] currentRow = new double[values.length];

			for (int i = 0; i < values.length; i++) {
				currentRow[i] = Double.parseDouble(values[i]);
			}
			rows.add(currentRow);

		}

		inputFile.close();
//		} catch (Exception e) {
//			System.out.println("Error reading file: " + e.getMessage());
//		}
		double[][] data = new double[rows.size()][];

		for (int i = 0; i < rows.size(); i++) {
			data[i] = rows.get(i);
		}

		return data;

	}

	// Writes totals, averages, highest/lowest values to an output file.
	// Writes summary information about the sales data to an output file.
	// @param filename name of the output file
	// @param data ragged 2D array of sales data
	// @throws IOException if file cannot be written

	public static void writeSummary(String filename, double[][] data) throws IOException {
		// try {
		PrintWriter writer = new PrintWriter(new FileWriter(filename));

		writer.printf("Total sales: %.2f%n", SalesDataUtility.getTotal(data));
		writer.printf("Average sale: %.2f%n", SalesDataUtility.getAverage(data));

		for (int row = 0; row < data.length; row++) {
			writer.printf("Row %d total: %.2f%n", row, SalesDataUtility.getRowTotal(data, row));
		}

		int maxColumns = 0;
		for (int row = 0; row < data.length; row++) {
			if (data[row].length > maxColumns) {
				maxColumns = data[row].length;
			}
		}

		for (int col = 0; col < maxColumns; col++) {
			writer.printf("Column %d total: %.2f%n", col, SalesDataUtility.getColumnTotal(data, col));
		}

		writer.printf("Highest sale: %.2f%n", SalesDataUtility.getHighestInArray(data));
		writer.printf("Lowest sale: %.2f%n", SalesDataUtility.getLowestInArray(data));

		writer.close();
	}
//	catch (Exception e) {
//			System.out.println("Error writing file: " + e.getMessage());
//		}
//	}
}
