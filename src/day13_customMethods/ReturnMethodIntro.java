package day13_customMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

   /*
   public static void sum(int n1, int n2){
        int result = n1 + n2;

    int result = sum(20,40);

    The sum method, that you created is a void method. It does not return any data, after it is get executed.

    You can still use the return statement in the void method, but you can not use it for returning a value.
    */

    int total = addition(10,20); //return method gives you a data, that you can store into a variable.

    int t =  square(10); //data 100
       // System.out.println(square(10));   another way


     int r = cube(5); //data 125
    // System.out.println(cube(5));   another way

    }

   /*
    public static void sum(int n1, int n2){

        int result = n1 + n2;
        System.out.println(result);

    } */
//#1
    public static int addition(int n1, int n2){

        // return n1 + n2; or you can also pass a variable

        int result = n1 + n2;
        return result;

    }

    public static int square(int num){

        int square = num * num;

        return square;

    }

    public static int cube(int num){ //method name and variable name can be same.
        int cube = square(num) * num;  //5*5=25*5=125
        return cube;

    }

/*
3. Create a method, that can return the cube of a number!
Cube: The number multiplied to itself 3 times.
num*num: square method inside the cube method. We don`t need to repeat the code fragments, we can just call the
previous methods.


2. Create a method, that can return/ calculate the square of a number! Make it also reusable outside the method!
E.g. square of 2 is 4; square of 9 is 81; multiplying the number with itself.

When I call the square method, I can pass a number -> method itself is a data.
You can also pass the data in te print statement, or you can also assign it to a variable.
The data is reusable, when you call it.
 */




}
/*
1. Create a method, that can return you the addition of two numbers, so you can reuse it even outside the method!
If you want to make the integer data reusable -> return type must be int.
Compile error line 32:
Everytime when you use a return type, that is other than void, it means you must return a value, that is matching with
the return type.
Return statement is a must, if the return type of the method is not void.
Now we created a return method.

The other use case of the return statement is for exiting the function.
 */