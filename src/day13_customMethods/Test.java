package day13_customMethods;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//performs its task: takes a user input and return a value at the end.

        input.close();
/*
return type is void: functionality is just to close the scanner; no returned value; no assignment to a variable needed.
You will not get any data from calling this void method. It just performs its task.
 */
        System.out.println(); //return type is void

        String str = "Java";
        str.toLowerCase();






    }
}
/*
So far used building methods from the scanner class, also known as standard library methods.
 */