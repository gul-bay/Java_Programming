package day15_whileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        while(!(age >= 1 || age > 150)){ //is not the valid condition -> invalid age; while the age is invalid
            System.out.println("Invalid entry! Please re-enter your age:");//then this statement needs to be repeated unknown times
            age = input.nextInt();
//The loop stops when the entered age is valid; if the while loop returns false opposite of the w.l. condition.


        }
            System.out.println("Invalid entry! Please re-enter your age:");







        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

    input.close();

    }
}
/*
Eligible to buy alcohol or not?
If the user enters an invalid age -> printing "Enter your age:" over and over again, until the user enters a valid age.
Here we don`t know how many times the user entry should be repeated; iteration number is unknown -> using while loop
 */