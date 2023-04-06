package day12_customMethods;

public class Test {

    public static void main(String[] args) {

/*
Verify if the number is odd or even!
oddOrEven method was created in the class named CustomMethodWithParameter.
Call the method!
The method contains the static keyword. Benefit of static modifier: You can just call it through the class name.
dot -> you will be able to have access to the methods in this class.
Select oddOrEven and pass the number you want to verify.
*/


        int number = 300;

        CustomMethodWithParameter.oddOrEven(300);


 /*
I want to print the initial of the person. -> Initial method; calling the custom method.
Earlier this method was created in the class CustomMethodsPractice dot method name initial. Then pass the name from that
you want the initials.
  */

    String firstName = "Vasyl",
            lastName = "Dobrianski";

CustomMethodsPractice.initial("Vasyl", "Dobrianski"); //V.D



    }
}
