package day13_customMethods;

public class ReturnStatement {
    public static void main(String[] args) {

    eligible(25);

        System.out.println("-------------------------------------------------------------------");

/*
If this exit condition is true, this return statement gets executed. It is going to exit the current method, which is
here the main method.
 */
        System.out.println("Test1 Started");
        boolean exit = true;
        if(exit){
            return; //The main method gets terminated at this line, when this return statement gets executed.
            //Only 'Test1 Started' gets executed.
        }
        System.out.println("Test1 Completed");

        System.out.println("Test2 Started");

    }

    public static void eligible(int age){
//This is the if statement, that is terminating the method.
        if(age < 0 || age > 150){
            System.err.println("Invalid age: " + age);
            return; // exits the method. If the age is invalid, then this method gets terminated.
        }
//This if and else statement does not depend on the condition above.
        if(age >= 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.err.println("You are not eligible to buy alcohol");
        }

    }
    public static int multiplication(int n1, int n2){

        int result = n1 * n2;

        return result; //returns the value when exiting the method


    }



}
/*
In the void method you can use the return statement to exit the function. But you can not use it for returning any value.

1. Create a void method: eligible to buy alcohol or not!
In order to exit the function after the 1st print statement, we can use return statement.
When the return statement gets executed, it exits the current method; the method gets terminated.
The current method is eligible.
If the condition is not true -> age is valid.
There are two independent if statements; their conditions does not depend on each other.
In Java void means, avoid returning a value.
When the method is a return method -> You must return a value; it becomes mandatory.

2. Create a method, that can return the multiplication of two numbers!
I want to make it reusable.
 */