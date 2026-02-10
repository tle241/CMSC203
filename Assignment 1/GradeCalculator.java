/*
 * Class: CMSC203
 * Instructor: Professor Grinberg
 * Description: Project 1 - Grade Calculator. Calculates a student's final course average and letter grade from a configuration file and a grades input file.
 * Due: 02/09/2026
 * Platform/compiler: Eclipse / Java
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: TRAN MINH CHAU LE
 */

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class GradeCalculator {

    public static void main(String[] args) throws Exception {

        System.out.println("========================================");
        System.out.println(" CMSC203 Project 1 - Grade Calculator");
        System.out.println("========================================");
        System.out.println();

        // -------------------------------
        // Declare Var
        // -------------------------------
        String courseName = "CMSC203 Computer Science I\r\n";
        int numberOfCategories = 0;

        String category1Name = "";
        int category1Weight = 0;
        double category1Average = 0.0;

        String category2Name = "";
        int category2Weight = 0;
        double category2Average = 0.0;

        String category3Name = "";
        int category3Weight = 0;
        double category3Average = 0.0;

        boolean usingDefaultConfig = false;

        // -------------------------------
        // File gradeconfig.txt
        // -------------------------------
        System.out.println("Loading configuration from gradeconfig.txt ...");

        File configFile = new File("gradeconfig.txt");

        if (configFile.exists()) {
            Scanner configReader = new Scanner(configFile);

            courseName = configReader.nextLine();

            //Categories
            numberOfCategories = configReader.nextInt();

            if (numberOfCategories != 3) {
                usingDefaultConfig = true;
            } else {
                // Category 1
                category1Name = configReader.next();
                category1Weight = configReader.nextInt();

                // Category 2
                category2Name = configReader.next();
                category2Weight = configReader.nextInt();

                // Category 3
                category3Name = configReader.next();
                category3Weight = configReader.nextInt();

                int totalWeight = category1Weight + category2Weight + category3Weight;
                if (totalWeight != 100) {
                    usingDefaultConfig = true;
                }
            }

            configReader.close();

        } else {
            usingDefaultConfig = true;
        }

        // -------------------------------
        // Default configuration
        // -------------------------------
        if (usingDefaultConfig) {
        	System.out.println("Configuration loaded successfully.");
            System.out.println();

            courseName = "CMSC203 Computer Science I";
            numberOfCategories = 3;

            category1Name = "Projects";
            category1Weight = 40;

            category2Name = "Quizzes";
            category2Weight = 30;

            category3Name = "Exams";
            category3Weight = 30;
        } else {
        	System.out.println("Configuration file invalid or missing.");
            System.out.println("Using default configuration.");
            System.out.println();
        }

        // -------------------------------
        // File Input, Output
        // -------------------------------
        String inputFileName = "grades_input.txt";
        String outputFileName = "grades_report.txt";

        System.out.println("Using input file: " + inputFileName);
        System.out.println("Using output file: " + outputFileName);
        System.out.println();

        // -------------------------------
        // Read score
        // -------------------------------
        File inputFile = new File(inputFileName);

        if (!inputFile.exists()) {
            System.out.println("ERROR: grades_input.txt not found.");
            System.out.println("Program exiting.");
            return;
        }

        Scanner inputReader = new Scanner(inputFile);

        System.out.println("Reading student scores...");
        System.out.println();

        String studentFirstName = inputReader.next();
        String studentLastName = inputReader.next();

        // -------------------------------
        // CATEGORY 1
        // -------------------------------
        String currentCategoryName;
        int numberOfScores;
        double totalScores;
        int scoreCounter;

        currentCategoryName = inputReader.next();  

        //check
        if (currentCategoryName.equals(category1Name)) {
            numberOfScores = inputReader.nextInt();
            totalScores = 0.0;
            scoreCounter = 0;

            while (scoreCounter < numberOfScores) {
                double currentScore = inputReader.nextDouble();
                totalScores = totalScores + currentScore;
                scoreCounter = scoreCounter + 1;
            }

            category1Average = totalScores / numberOfScores;
        } else {
            numberOfScores = inputReader.nextInt();
            scoreCounter = 0;
            while (scoreCounter < numberOfScores) {
                inputReader.nextDouble();
                scoreCounter = scoreCounter + 1;
            }
        }

        // -------------------------------
        // CATEGORY 2
        // -------------------------------
        currentCategoryName = inputReader.next();  // ví dụ: Quizzes

        if (currentCategoryName.equals(category2Name)) {
            numberOfScores = inputReader.nextInt();
            totalScores = 0.0;
            scoreCounter = 0;

            while (scoreCounter < numberOfScores) {
                double currentScore = inputReader.nextDouble();
                totalScores = totalScores + currentScore;
                scoreCounter = scoreCounter + 1;
            }

            category2Average = totalScores / numberOfScores;
        } else {
            numberOfScores = inputReader.nextInt();
            scoreCounter = 0;
            while (scoreCounter < numberOfScores) {
                inputReader.nextDouble();
                scoreCounter = scoreCounter + 1;
            }
        }

        // -------------------------------
        // CATEGORY 3
        // -------------------------------
        currentCategoryName = inputReader.next();  // ví dụ: Exams

        if (currentCategoryName.equals(category3Name)) {
            numberOfScores = inputReader.nextInt();
            totalScores = 0.0;
            scoreCounter = 0;

            while (scoreCounter < numberOfScores) {
                double currentScore = inputReader.nextDouble();
                totalScores = totalScores + currentScore;
                scoreCounter = scoreCounter + 1;
            }

            category3Average = totalScores / numberOfScores;
        } else {
            numberOfScores = inputReader.nextInt();
            scoreCounter = 0;
            while (scoreCounter < numberOfScores) {
                inputReader.nextDouble();
                scoreCounter = scoreCounter + 1;
            }
        }

        inputReader.close();

        // -------------------------------
        // Average scores
        // -------------------------------
        double overallAverage = 0.0;

        overallAverage = overallAverage + category1Average * category1Weight / 100.0;
        overallAverage = overallAverage + category2Average * category2Weight / 100.0;
        overallAverage = overallAverage + category3Average * category3Weight / 100.0;

        // -------------------------------
        // Letter grade
        // -------------------------------
        String baseLetter = "";

        if (overallAverage >= 90.0) {
            baseLetter = "A";
        } else if (overallAverage >= 80.0) {
            baseLetter = "B";
        } else if (overallAverage >= 70.0) {
            baseLetter = "C";
        } else if (overallAverage >= 60.0) {
            baseLetter = "D";
        } else {
            baseLetter = "F";
        }

        // -------------------------------
        // Print name, categories
        // -------------------------------
        System.out.println("Student: " + studentFirstName + " " + studentLastName);
        System.out.println("Course: " + courseName);
        System.out.println();

        System.out.println("Category Results:");
        System.out.printf("  %s (%d%%): average = %.2f%n", category1Name, category1Weight, category1Average);
        System.out.printf("  %s (%d%%): average = %.2f%n", category2Name, category2Weight, category2Average);
        System.out.printf("  %s (%d%%): average = %.2f%n", category3Name, category3Weight, category3Average);

        // -------------------------------
        // Yes/No 
        // -------------------------------
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.print("Apply +/- grading? (Y/N): ");
        String userChoice = keyboard.nextLine();

        while (!userChoice.equalsIgnoreCase("Y") && !userChoice.equalsIgnoreCase("N")) {
            System.out.print("Invalid. Enter Y or N: ");
            userChoice = keyboard.nextLine();
        }

        // -------------------------------
        // Final grade
        // -------------------------------
        String finalLetter = baseLetter;

        if (userChoice.equalsIgnoreCase("Y")) {
            double integerPart = (int) overallAverage;
            double decimalPart = overallAverage - integerPart;

            if (decimalPart >= 0.98) {
                finalLetter = baseLetter + "+";
            } else if (decimalPart <= 0.02) {
                finalLetter = baseLetter + "-";
            }
        }

        // -------------------------------
        //Print Final
        // -------------------------------
        System.out.println();
        System.out.printf("Overall numeric average: %.2f%n", overallAverage);
        System.out.println("Base letter grade: " + baseLetter);
        System.out.println("Final letter grade: " + finalLetter);
        System.out.println();

        // -------------------------------
        //File grades_report.txt
        // -------------------------------
        PrintWriter writer = new PrintWriter(outputFileName);

        writer.println("Course: " + courseName);
        writer.println("Student: " + studentFirstName + " " + studentLastName);
        writer.println();

        writer.printf("%s (%d%%): average = %.2f%n", category1Name, category1Weight, category1Average);
        writer.printf("%s (%d%%): average = %.2f%n", category2Name, category2Weight, category2Average);
        writer.printf("%s (%d%%): average = %.2f%n", category3Name, category3Weight, category3Average);

        writer.println();
        writer.printf("Overall numeric average: %.2f%n", overallAverage);
        writer.println("Base letter grade: " + baseLetter);
        writer.println("Final letter grade: " + finalLetter);

        if (usingDefaultConfig) {
            writer.println("Default configuration was used.");
        } else {
            writer.println("Default configuration was not used.");
        }

        writer.close();

        System.out.println("Summary written to " + outputFileName);
        System.out.println("Program complete. Goodbye!");

        keyboard.close();
    }
}
