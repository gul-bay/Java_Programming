package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //1.Enter key (from gender), 2.Enter key (from age)

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();
        //Aaron King Daniel + Enter. NextLine reads everything of this line, even including the enter key. There will be nothing left in Scanners memory.

        System.out.println("Enter your school name:");
        String school_name = input.nextLine(); //Cydeo School + Enter
        //If you have nextLine method after another nextLine method, you do not have to give an additional nextLine, to clear out the Scanners memory because nothing is left there.

        System.out.println("Enter your gender:");
        String gender = input.next(); //Male + Enter
        //next method reads 'female' and the enter key will be left in the Scanners memory.

        System.out.println("Enter your age:");
        int age = input.nextInt(); //28 + Enter
        //nextInt reads only 28 and the enter key will be left in the Scanners memory.

        input.nextLine();
        /* Clear out the Scanner, so that we are able to get the input.
        We have to give extra nextLIne() method if we are using a nextLine() method after the other methods of Scanner.
        2 enter keys, that are left in the Scanners memory by the other next methods, before this nextLine.
        */
        System.out.println("Enter your street name:");
        String street_name = input.nextLine();
        /* 2 enter keys, that are left in the Scanner; by default it is taken by the nextLine method and assign it to the String.
        If you call the nextLine method first it is going to read what is left in the Scanners memory.
        If there is nothing in the Scanner, then it is going to ask for the user input.
        If you are using the nextLine method after the other methods of Scanner, you must provide one additional nextLine method before you use it.
         */







    }
}
