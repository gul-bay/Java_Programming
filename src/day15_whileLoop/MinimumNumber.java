package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;
        /*
        Assign the maximum number of integer. Any integer number, that user enters will always be less than 2147483647,
        which is the minimum number of integer.
         */

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the number: ");
            int num = input.nextInt();

            if(num < min){ //If the user entered entry is less than the current minimum number, that we have
                min = num; // then user entered number should be the minimum number
            }

        }

        System.out.println("Minimum number is: " + min);


        input.close();






    }


}
/*
2. Write a program that can ask the user to enter a number for 5 times and returns the minimum number!

As the minimum value of the integer we assign: 2147483647 -> gives default condition here.
Any number, that the user entered will always be less than the number above. -> The number will be replaced by the 1st
entered number.
Suppose that user entered: 20, 5, 30, -5, 100, 200.
1st execution of the loop: 20 < 2147483647 = true; 20 becomes the minimum number.
2nd e.o.t.l.: 30 < 20 = false;
3rd e.o.t.l.: -5 < 20 = true; -5 becomes the minimum number.
4th e.o.t.l.: 100 < -5 = false;
5th e.o.t.l.: 200 < -5 = false; -5 is still the minimum number

 */