/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: This Driver class uses a loop to read input for multiple movies
 *              and continues based on user response to the prompt in the console.
 * Due: 02/23/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Tran Minh Chau Le
*/

//import 
import java.util.Scanner;

public class MovieDriverTask1 {

	public static void main(String[] args) {

		// Scanner
		Scanner keyboard = new Scanner(System.in);

		// Create a new movie object
		Movie movie = new Movie();

		// Prompt the user to enter the title of a movie
		System.out.println("Enter the name of the movie ");

		// Read in the line that the user types
		String titleInput = keyboard.nextLine();

		// Set the title in the movie object
		movie.setTitle(titleInput);

		// Prompt the user to enter the movie's rating
		System.out.println("Enter the rating of the movie ");

		// Read in the line that the user types
		String ratingInput = keyboard.nextLine();

		// Set the rating in the movie object
		movie.setRating(ratingInput);

		// Prompt the user to enter the number of tickets sold at an unnamed theater
		System.out.println("Enter the number of tickets sold for this movie ");

		// Read the integer that the user types
		int ticketsInput = keyboard.nextInt();

		// Set the number of tickets sold in the movie object
		movie.setSoldTickets(ticketsInput);

		// Print out the information using the movie's toString method
		System.out.println(movie.toString());
		System.out.println("Goodbye");
		keyboard.close();
	}
}
