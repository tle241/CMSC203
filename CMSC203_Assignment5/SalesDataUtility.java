/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Provides static helper methods that process in a ragged two-dimensional array 
 * Due: 04/20/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//static utility class
public final class SalesDataUtility {

	private SalesDataUtility() {

	}

//	return the sum of every sales value in the ragged array
//	@param data ragged array of sales values
//	@return sum of all values in the array
	public static double getTotal(double[][] data) {
		double total = 0.0;

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
			}
		}
		return total;
	}

	// Return the average of every sales value in the ragged array
	// @param data ragged array of sales values
	// @return average of all values, or 0.0 when the array has no values
	public static double getAverage(double[][] data) {
		double total = 0.0;
		int count = 0;

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
				count++;
			}
		}
		if (count == 0) {
			return 0.0;
		}
		return total / count;
	}

	// Return total of one row in the ragged array
	// @param data ragged array of sale values
	// @param row the row index
	// @return sum of requested row
	public static double getRowTotal(double[][] data, int row) {
		double total = 0.0;
		for (int col = 0; col < data[row].length; col++) {
			total += data[row][col];
		}
		return total;
	}

	// Return total of one column across all rows that contain that column
	// @param data ragged array of sales values
	// @param col the column index
	// @return sum of the requested column
	// If a row does not have column index=>skip
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0.0;

		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				total += data[row][col];
			}
		}
		return total;
	}

	// Return the highest value in the requested row
	// @param data ragged array of sales valuees
	// @param row the row index
	// @return highest value in the row
	public static double getHighestInRow(double[][] data, int row) {
		double highest = data[row][0];

		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] > highest) {
				highest = data[row][col];
			}
		}
		return highest;
	}

	// Return the lowest value in the request row
	// @param data ragged array of sales values
	// @param row the row index
	// @return lowest value in the row
	public static double getLowestInRow(double[][] data, int row) {
		double lowest = data[row][0];
		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] < lowest) {
				lowest = data[row][col];
			}
		}
		return lowest;
	}

	// Return the highest sales value found in the ragged array
	// @param data ragged array of sales values
	// @return highest value in the array
	public static double getHighestInArray(double[][] data) {
		double highest = data[0][0];

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (data[row][col] > highest) {
					highest = data[row][col];
				}
			}
		}
		return highest;

	}

	// Return lowest sales values found in ragged array
	// @param data ragged array of sales values
	// @return smallest value in the array
	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (data[row][col] < lowest) {
					lowest = data[row][col];
				}
			}
		}
		return lowest;
	}

}