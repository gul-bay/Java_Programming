package day14_forLoop;

public class ForLoopPractice3 {
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 100; i++){
        sum += i;
        }

        System.out.println(sum); //5050

        System.out.println("---------------------------------------------------------------------------------");

    for(char i = 'A'; i<= 'Z'; i++){
        System.out.print(i +" ");
    }

        System.out.println();

        System.out.println();

        System.out.println("------------------------------------------------------------------------------------");

        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i +" ");
        }
        System.out.println();

        System.out.println("Cydeo");





    }
}
/*
1.Write a program that can find me the sum of all the numbers between 1~100!
The sum of the numbers are need to print one time at the end; printing the sum should not be inside the loop.
The question to yourself: Do I need to repeat this for many times? If it should not be repeated, it has to be outside the loop.
The loop must start with a true condition.
The condition must be created based on the initializations variable that you have.
In order to find the sum in the mathematics you can continue to add those numbers to zero.
So before this loop you can declare a variable named sum and you will assign zero. Because if you add any number to the zero
you will just get the number itself. That`s why the sum needs to be start at zero.
Now you can increase the value of the sum by 'i': sum += i.
Therefore, when the loop is getting executed 1 will be added to the sum.
When the loop is getting executed a 2nd time 2 will be added on top of sum`s value.
After this loop is being executed so 1 to 100 wil be added to the variable sum.
After this loop you do have the sum of the numbers between 1 to 100..
If I want to print the value of this variable I should place it after the loop because it does not need to be repeated.





2.a. Write me a program that can display all the alphabet letters from A~Z!
2.b. Print all the alphabet letters backwards!



 */