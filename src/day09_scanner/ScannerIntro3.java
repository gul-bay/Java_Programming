package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
      //  char ch = input.next().charAt(0); //How you can get the char input from the user.

       // System.out.println("You entered: " +ch);



//next(); method to return only one word; reads only one word until the next space
        System.out.println("Would you like to continue?"); //one word answer: yes or no; the first word will be assigned to the console.
        //String answer = input.next();

        String answer = input.nextLine(); //method is able to read the entire line

        System.out.println("You have entered: " + answer);


    input.close();


    }
}
