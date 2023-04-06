package day15_whileLoop;

import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648; //assign the smallest possible integer, that user could enter.
        int min = 2147483647; //assign the largest possible integer, that user could enter.

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if(num > max){
                max = num;

            }

            if(num < min){
                min = num;
            }
        }

        System.out.println("Maximum number is: " +max);
        System.out.println("Minimum number is: " +min);

    }
}
/*
Two separate conditions for the maximum and the minimum number.
 */