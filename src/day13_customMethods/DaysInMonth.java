package day13_customMethods;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();

        if(month < 1 || month > 12){ //if the month is invalid
            System.err.println("Invalid number");
            return; // terminates the main method
        }

        switch (month){ //If this statement gets executed. The precondition is: month between 1~12

            case 2:
                System.out.println("28 days");
                break;

            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;

            default:                         //The month numbers other than 2, 4, 6, 9, 11 -> 1, 3, 5, 7, 8, 10, 12
                System.out.println("31 days");

        }



    }
}
/*
If the main method is not getting terminated -> The implicit information is: month is valid number (1~12).
If the month is valid number (1~12), I can use the switch statement to find out how many days the month has.


 */