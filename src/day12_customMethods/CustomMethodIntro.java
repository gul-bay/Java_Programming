package day12_customMethods;

public class CustomMethodIntro {
    public static void main(String[] args) {

        System.out.println("Test Started");

        greetings(); // method call; calling the custom method that is created in line 19~21
        System.out.println("Test Completed");

        System.out.println("-----------------------------------------------------------");

        displayMessage();


    }

    public static void greetings(){
        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
        System.out.println("Are you ready to learn Java?");

    }

    public static void displayMessage(){

        System.out.println("Hello World");
        System.out.println("I love Java");

    }



}
/* Functionality of main method: to run the code fragments within this file; it makes every Java file to be runnable
Whichever code fragment you give in the main methods body gets executed from top to bottom, even the main method has
his own functionality.
'void' indicates: whatever data you have in this main method, you can not return any value outside the methods body.

What if I want to create my own custom method, where should I create it?
Declaring a method:
You have to make sure that you custom method is outside the main methods body.
Every single method when you declare them, they must be independent methods; they must be created inside the class,
in the class body. They must be created outside any other blocks in the class.
One method can not be declared inside another method; it has to be an independent method.
We want to use 'void' as the return type of the method.
Descriptive method name; something that makes sense with the functionality of the method.
You must store code fragments in the method.
Define the body of the method by using curly braces.
You have to give the print statement first.
Calling this method is equivalent to giving the code fragments in line 9-10.
If you want to execute the custom method 'greetings', if you want the output of the method to printed on the console
you had to call it inside the main method. Whatever you give in the main
method, it gets executed from top to bottom (execution flow).
You can call the methods anywhere.
I call the method in the main method by using the method name 'greetings();'
After create the methods minimize it to count the methods easier. -> easier to count the methods, to see where the method
started and where is ended.
The custom methods only get executed when you call them.
You can create as many methods as you want.
 */