package day13_customMethods;

public class ReturnMethodsPractice {
    public static void main(String[] args) {

        System.out.println(isOdd(100)); //false

        //another solution way: applying the result to the if statement.
        int num = 200;
        if(isEven(num)){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }
        System.out.println("-----------------------------------------------------------------------");

    }

    public static boolean isOdd(int num){
    //    return (num % 2 != 0)? true : false;

        if(num % 2 != 0){
            return true;
        }else{
            return false;
/*
Once the return statement get executed -> method gets exit.
In the return methods you can also return a value, when you exit.
Exit means, any code after the exit, will not be executes.
Alterative: Instead of the else block, if the isOdd never gets executed -> return false
Because only one of the return statements get executed at the end.
 */


        }
    }

    public static boolean isEven(int num){
        return !isOdd(num); //preferred solution
    //return (num % 2 == 0)? true : false;               another way

    }

    public static int max(int n1, int n2){
   //   return n1 > n2 ? n1 : n2;

        if(n1 > n2){
            return n1;

        }else{
            return n2; // or only return n2; without else block.

        }





    }






}
/*
1. Create a method named isOdd, that can return true if a number is an odd number!
I want to be able to reuse the data. Make sure, that the data will be returned from the data.
All tasks have different solving ways.
Returns boolean for us: isOdd = true; !isOdd = false.
Using the return statement to return the value.
By using Ternary based on the argument.
When the number is not evenly divisible. We divide a number by 2, that is not equal to zero.
You can always reuse the value.


2. Create a method named isEven, that can return true if a number is an even number!
Opposite of the isOdd method. If the number !isOdd, then it is an even number.
Once you have a method, you can reuse it in the other methods.

3. Create a method named max, that can return the maximum number between two numbers!

4. Create a method named min, that can return the minimum number between two numbers!

Most of the String methods are return methods; they return you a value.
 */