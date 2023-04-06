package day09_scanner;

import java.util.Scanner;

public class ScannerIntroA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Creating the Scanners object.

        System.out.println("Enter your first number:");  //Before writing the Scanner methods, in order to guide the user, we place these additional print statements.

        byte num1 = input.nextByte(); //-128 ~ 127
        /* Method call from the Scanner. It waits until user provides the entry. Whatever the user is provided it is going to store it into this variable 'num1'.
        This variable is for containing the data that the user just entered.
        You can also assign the byte value to int data type or long data type. Because implicit casting is going to converting the byte value into int.
        */
        System.out.println("Enter your second number:");

        short num2 = input.nextByte();

        System.out.println("Enter your third number:");

        int num3 = input.nextInt();

        System.out.println("Enter your forth number:");

        //long num4 = input.nextLong();
        int num4 = (int) input.nextLong();
        /*manual casting because larger primitive type to smaller primitive type
          if you want to use integer, you can directly use int; you don`t have to do those castings, you can just use the same type */

       //input.close(); //Scanner is closed, can not read user inputs again. Suggestion: you can place it at the end of the main method.

       /* System.out.println("Enter your fifth number:");
        int num5 = input.nextInt();

        Scanner is closed at line 27. Once it`s closed can not read inputs.
        */

        System.out.println("First number: " +num1);
        System.out.println("Second number: " +num2);
        System.out.println("Third number:" +num3);
        System.out.println("Forth number:" +num4);
       // System.out.println("Fifth number:" +num5);

        input.close();

    }
}
/*
Execution order from top to bottom.
 */