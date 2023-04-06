package day14_forLoop;

public class ForLoopPractice2 {
    public static void main(String[] args) {

        for(int i = 10; i >= 5; i--){ //i: 10,9,8,7,6,5
            System.out.println("Hello Cydeo " +i); //1,2,3,4,5,6

        }


    }
}
/*
Initialization starts by 10, going backwards to 5; including 5. -> it is going to execute the statement 5 times.
The condition i >= 5 is evaluated to true at the beginning. The first execution needs to be true.
We have to decrease 'i' s value by 1 -> i--
When the condition i >= 5 becomes false, that`s the time when the loop is going to stop.

When the loop starts the initialization will be checked first: i=10
Next the condition will be checked. The condition i>=5 is true. -> The statement in the loops body will get executed.
'Hello Cydeo' will be printed for the first time.
Then the iteration will be executed; the value 'i' will be decreased by 1 -> i=9 is true.
After this the condition will be checked again. 9>=5 -> 'Hello Cydeo' will be printed a 2nd time.
Then the decrement operator will be executed again. -> i=8; 8>=5 is true -> 'Hello Cydeo' will be printed the 3rd time.
'i' will be decreased by 1: i=7; 7>=5 is still true -> 'H.C.' will be printed 4th time.
i=6; 6>=5 -> true, print for the 5th time.
i=5; 5>=5 -> true, print for the 6th time.
After 'H.C.' is printed for the 6th time, 'i' is decreased again by 1: i=4; 4>=5 -> false, the loop stops.
If I want to print 'H.C.' for 5 times only, I should be excluding 5 by using i > 5.
I can also use the i in the for loops body by using concatenation +i.
You can only use this in the for loop.

The loop in the forward direction is easier.
 */