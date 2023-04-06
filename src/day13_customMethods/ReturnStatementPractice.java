package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice {
    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0); //How you get the char input from the scanner.

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if(!isValid){ //if the grade is not valid; the termination condition
            System.err.println("Invalid grade");
            return; //If this if-statement gets executed, it terminates/ exits the main method.
        }
//If the grade isValid:
        System.out.println( (grade == 'A') ? "Excellent" : (grade == 'B') ? "Great Job" : (grade == 'C') ? "Good"
                : (grade == 'D') ? "Passed" : "Failed" );





    }





}
