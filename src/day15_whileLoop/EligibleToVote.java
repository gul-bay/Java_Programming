package day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt(); //valid age: 1~120

        while (!(age >= 1 && age <= 120 )){ //while the age is not valid.

            System.err.println("Invalid Entry. Please re-enter your age:");
            age = input.nextInt(); //the entered age will be assigned back to the variable age.

        }

        System.out.println("Are you a US citizen? Yes/No");
        String yesOrNo =input.next().toLowerCase();

        while (! (yesOrNo.equals("yes") || yesOrNo.equals("no") )){ //while the answer is neither yes nor no

            System.err.println("Invalid Entry. Please re-enter");
            System.err.println("Are you a US citizen? Yes/No");
            yesOrNo = input.next().toLowerCase();


        }

        if(age >= 21 && yesOrNo.equals(("yes"))){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }

        input.close();


    }
}
/*
We need to know: the age of the person and if the person is US citizen or not.
To get those inputs from the user, we can use the Scanner.
If the user enters invalid age, ask the user to enter another age.
We don`t know how many times we need to ask the user to re-enter the age. If the user continuously provides an
invalid age, we should repeatedly ask the user to re-enter the age, until the user provides the valid data.
Create the while loop: While the age is invalid.
Usually to give the invalid condition is: use the exclamation mark !, and inside the parenthesis you can give the
valid condition. -> valid condition will eventually be converted to invalid by the logical not operator.
Whenever the age is valid -> the while loop stops.
A valid age makes the while loop condition false. -> the w.loop gets not executed.
The while loop only gets executed, when the invalid age has been entered.

If you want to limit the iteration times ot the loop, you should use for loop.

"Are you a US citizen?" I am expecting the user to provide Yes/No only. If the user provides anything else than Yes/No ->
repeatedly ask "Invalid entry, please re-enter Yes/No".
toLowerCase(): ignores case sensitivity.
We have to repeat the while loop, whenever the answer is invalid.
Inside the parenthesis is the valid condition. With the exclamation mark it will give me the expression of invalid.


 */