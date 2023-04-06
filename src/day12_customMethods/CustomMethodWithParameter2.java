package day12_customMethods;

public class CustomMethodWithParameter2 {
    public static void main(String[] args) {

        int num1 = 100;
        oddOrEven(num1);

        int num2 = 35;
        oddOrEven(num2);

        int num3 = 79;
        oddOrEven(num3);

        int num4 = 39;
        oddOrEven(num4);

/*
To verify these numbers -> method call for 4 times with passing the corresponding variable
 */
    }
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
Custom Method is much more readable, understandable, shorter.
 */









