package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

 /*
Enter 5 numbers and give me the sum of the 5 numbers!
 */

        int sum = 0;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number");
            sum += input.nextInt();
        }

        System.out.println("sum = " + sum );

        System.out.println("-------------------------------------------------------------------");

/*
Write a program that can ask user to enter a number for 5 times!
Print the maximum number!

Write a program that can ask user to enter a number for 5 times!
Print the minimum number!
 */





    }
}
