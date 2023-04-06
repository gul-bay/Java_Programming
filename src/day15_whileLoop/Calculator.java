package day15_whileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        double num1 = input.nextDouble();

        System.out.println("Enter your second number");
        double num2 = input.nextDouble();

        System.out.println("Enter a math operator");
        char operator = input.next().charAt(0); //char only have one character

        boolean validOperator = operator == '+' || operator == '-' || operator == '*' || operator == '/'; //valid cond.

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')){
            /* not valid condition; while the operator is invalid.
        It will be repeated until the valid operator is entered.
         */
            System.err.println("Invalid Operator! Please re-enter the math operator.");
            operator = input.next().charAt(0);
            //As soon as the user provides a new operator: -> assign it back to the variable operator

        }
//If the user enters valid operator
        if(operator == '+'){
            System.out.println(num1 + num2);
        }else if(operator == '-'){
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        }else{ // /
            System.out.println(num1 / num2);
        }

        input.close();
    }
}
/*
If the user enters an invalid operator, I can user ask to re-enter a valid operator.
 */