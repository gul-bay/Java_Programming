package day14_forLoop;

public class ForLoopIntro {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){ //i: 1,2,3,4,5,6,7,8,9,10
            System.out.println("Hello World"); //1,2,3,4,5,6,7,8,9,10

        }


    }

}
/*
10 times repeating statement "Hello World" by the program -> saves time, saves energy; the program never gets tired of it.
Create the loop that can executes for 10 times. The repeating number is known -> for loop
Initialization usually starts from 1 or 0. If you need to repeat the statement for 10 times -> start from 1.
Condition, ending point should be 10. You have to give 10 as a boolean condition: i < 10. Under this condition the loop can be repeated
as long as 'i' is less than 10.
Condition always using the initializations variable.
After the statement is repeated 10 times I have to make sure that this condition gets false. In order make this condition to
be false, I should to increase 'i' by 1. -> using the increment operator ++ (from the unary operators)
If you give the increment of i++, the condition will be checked again.
i started from 1. When i = 1, the condition i<10 is true. -> 'Hello World' will be printed 1 time
Next step this iteration gets executed. It increases the value by 1 -> i = 2 ; i < 10 -> true; 'Hello World' will be printed a 2nd time.
Then the iteration gets executed again. 2 will be increased the value again by 1 -> i = 3; i < 10 -> true; 'H.W.' will be printed a 3rd time.
The value will be continuously increased by 1, till it reaches the value 10: i = 10; i < 10 -> false. 'H.W.' will not
be printed for the 10th time. It will be printed 9 times in total.
To include 10 we have to use i <= 10 or i < 11.
 */