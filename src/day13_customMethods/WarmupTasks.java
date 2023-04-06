package day13_customMethods;

import java.util.Scanner;

public class WarmupTasks {
    public static void main(String[] args) {
        //#1
        calculate(200,5,'/'); //You can pass values or variables and mathOperator in the parameter order

        calculate(1,100,'-');


 /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your two numbers and a math operator:");
        double n1 = input.nextDouble(),
               n2 = input.nextDouble();

        char operator = input.next().charAt(0);

        calculate(n1, n2, operator);

        // Once you have the method you can also apply it to the scanner.
         The calculate method calculates the 1st and 2nd number based on the operator, that is entered by the user.
        Use case of this method: Calculate the result. */

        System.out.println("----------------------------------------------------------------------------------------");

        //#2
        ageGroup(28); //Adult
        ageGroup(75); //Senior

        System.out.println("----------------------------------------------------------------------------------------");

        //#3
        eligibleToVote(35, false);
        eligibleToVote(18,true);



        }






    //#1
   public static void calculate(double num1, double num2, char mathOperator){

      double result = 0;
     /*
     zero: just to store the calculation result.
     Another way, if you don`t want to use the result variable:
      System.out.println(num1 + " " + mathOperator +" " + num2 + " = " + (num1 + num2) );
      System.out.println(num1 + " " + mathOperator +" " + num2 + " = " + (num1 - num2) );
      System.out.println(num1 + " " + mathOperator +" " + num2 + " = " + (num1 * num2) );
      System.out.println(num1 + " " + mathOperator +" " + num2 + " = " + (num1 / num2) );
      */


       switch (mathOperator){

           case '+': result = num1 + num2;
               System.out.println(num1 + " " + mathOperator +" " + num2 + " = " + result );
               break;

           case '-': result = num1 - num2;
               System.out.println(num1 + " " + mathOperator +" " + num2 + " = " + result );
               break;

           case '*': result = num1 * num2;
               System.out.println(num1 + " " + mathOperator +" " + num2 + " = " + result );
               break;

           case '/': result = num1 / num2;
               System.out.println(num1 + " " + mathOperator +" " + num2 + " = " + result );
               break;

           default:
               System.err.println("Invalid operator: " + mathOperator);

       }



   }

   //#2
   public static void ageGroup(int age){

    if(age >= 0 && age <= 150){

        System.out.println( (age < 21)? "Teenager" : (age < 55)? "Adult" : "Senior"); //Ternary


    }else{
        System.out.println("Invalid age: " + age);
    }


   }


    //#3
   public static void eligibleToVote (int age, boolean isAmerican){

        if(age >= 18 && isAmerican){
            System.out.println("You are eligible to vote");

        }else{
            System.err.println("You are not eligible to vote");

        }

   }


}
/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

	        Ex:
	            calculate(10, 20, '+')

	        output:
	            10 + 20 = 30

Parameters are known as the variables of the method.
The values of the variables: The user given argument, when the method is being called. Only the arguments will be
assigned to these variables.
Switch statement: The calculation result will be depending on the operator.
Data types, that the switch does not accept: double, long, float, boolean.
We need to create 4 case blocks. If the operator is invalid -> default block.
In the switch statements body nothing is mandatory to give, such as case block, break statement, default block.
Once the method is completed -> minimize the methods body.




2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )

Nested If condition
Multi Branch if or Ternary possible.
If precondition is true, we have 3 possible outcomes -> create 3 more conditions under this 1 precondition. In this case
multi-branch if.
Ternary at the end returns me a value, which you can also pass in the print statement.


3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote

 */