package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;
        /*
        default condition is created now. Any integer number, that user enters will always be greater than -2147483648,
        which is the minimum number of integer.
         */

        for(int i = 0; i < 5; i++){ //loop gets executed, when i`s value are: 0, 1, 2, 3, 4

            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if(num > max){ //If the user entered entry is greater than the current maximum number that we have
                max = num; // assign the user entered number to the variable max; then user entered number should be the maximum number.
            }

        }


        System.out.println("Maximum number is: " + max);

        input.close();

    }
}
/*
1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number!
The iteration times is known -> for loop.
The loop condition has to be true to get the loop run.

The minimum value of the integer: -2147483648.
The possible smallest number, that user enters as an integer.
Any entered integer is greater than this number above. -> The number will be replaced by the 1st
entered number.
Suppose that user entered: 10, 5, 3, 20, 15.
1st iteration of the loop: 10 >-2147483648 = true; 10 becomes the maximum number and replaces the current number.
2nd iteration of the loop: 5 > 10 = false; 10 is still the maximum number. 5 will not replace 10.
3rd iteration of the loop: 3 > 10 = false.
4th i.o.t.l.: 20 > 10 = true; 20 becomes the maximum number, replaces 10.
5th i.o.t.l.: 15 > 20 = false; 20 is still maximum number.

User entered: -25, 35, 15, 40, 0
1st i.o.t. loop: -25 > -2147483648 = true; -25 becomes maximum number.
2nd i.o.t.l.: 35 > -25 = true; 35 becomes maximum number.
3rd i.o.t.l.: 15 > 35 = false;
4th i.o.t.l.: 40 > 35 = true; 40 becomes maximum number.
5th i.o.t.l.: 0 > 40 = false; 40 will be the maximum number at the end.

This is one of the algorithm to find the maximum number.




	3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */