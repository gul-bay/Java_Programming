package day12_customMethods;

public class CustomMethodWithParameter {
    public static void main(String[] args) {

        oddOrEven(100);

        System.out.println("----------------------------------------------------");

        oddOrEven(10000);

    }
//The method takes an argument number, and verifies if the number is odd number or even number.
public static void oddOrEven (int number){

    if(number % 2 ==0){ //if the number is divisible by 2
        System.out.println(number + " is even number");
}else{
        System.out.println(number + " is odd number ");
    }

    }










    }
/*
Create the function that can check if it is odd number or even number!
It should print: The number is odd/ The number is even.
Do I need pass parameter in this method? If there is information the method must have, then you have to pass parameter.
Odd or even -> Here I must pass the number first to the method, so that the functionality of the method can be completed.
This function requires additional information.
In order to see the output on the console I need to call the method in the main method.
The parameter will be assigned to the variable number. The number will be replaced by 100. Then the if condition is going
to check, if 100 is even. Otherwise, the else block gets executed.
Benefit of the method: You don´t need the same set of code fragments in multiple different steps over and over again.
You just store them into the method, and you call the method to reuse it by providing the number.
Before you create the method you should give a comment, which would be the short description of what the functionality
of the method is.
*/