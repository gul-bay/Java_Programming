package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {

//I will not use the Scanner more than one time -> not assigning to a variable.
        int number = new Scanner(System.in).nextInt();


        if(number < 1 || number > 7){
            System.out.println("Invalid Number: " + number);
            return; //exiting the main method without returning a data.
        }

        System.out.println( (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" :
                (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday");



    }


}
/*
A number is given to you. Write a program, that can display the name of the day the number is representing!
As long as your number is 1~7 -> Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
Otherwise: Invalid result
Create the condition for terminating the method by applying the return statement!
Starting from line 15 you can assume, that the number, that you give is a valid number.
Ternary
 */