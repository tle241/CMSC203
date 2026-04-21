
/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: This is console driver with main class.
 * Due: 04/20/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/
import java.io.IOException;
import java.util.Scanner;

//console driver with main
public class SalesAppDriver {
//	Asks user for input and output file names.
//	Uses SalesFileIO to read data and write summary.
//	Uses SalesDataUtility to compute results.

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		try {
			System.out.print("Enter input file name: ");
			String inputFileName = keyboard.nextLine();

			System.out.print("Enter output file name: ");
			String outputFileName = keyboard.nextLine();

			double[][] salesData = SalesFileIO.readSalesData(inputFileName);
			SalesFileIO.writeSummary(outputFileName, salesData);

			System.out.println("Processing complete.");
			System.out.printf("Total sales: %.2f%n", SalesDataUtility.getTotal(salesData));
			System.out.printf("Average sale: %.2f%n", SalesDataUtility.getAverage(salesData));
			System.out.printf("Highest sale: %.2f%n", SalesDataUtility.getHighestInArray(salesData));
			System.out.printf("Lowest sale: %.2f%n", SalesDataUtility.getLowestInArray(salesData));
		} catch (IOException e) {
			System.out.println("Error: Could not read or write file.");
		} catch (NumberFormatException e) {
			System.out.println("Error: File contains invalid number format.");
		}

		keyboard.close();
	}
}
