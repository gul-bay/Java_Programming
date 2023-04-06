package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = input.nextLine().trim().replace(" ","");
        /* in case that user types space at first -> trim() method.
        replace() method in case that the user type space between the name
trim() & replace() methods will make sure that the whitespaces and additional spaces between the characters will be removed.


    String firstName = "cvDEo";
       String lastName = "SCHOOL";
     */
        System.out.println("Enter your last name:");
       String lastName = input.nextLine().trim().replace(" ","");

       input.close();

    firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
/* getting the first character of the first name "c" -> new String: "C"
Concatenating the remaining characters of the first name starting from character 2 (= index number 1) until the last character into the lower case.
-> first character in upper case and the remaining characters in lower case
 */
    lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName); //Cydeo
        System.out.println(lastName); //School

    String fullName = firstName +" " + lastName;
        System.out.println(fullName); //Cydeo School




    }
}
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */