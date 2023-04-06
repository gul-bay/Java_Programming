package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) { //iteration from 1~5

            if (i == 4) { //condition for skipping
                continue; //1235, 4 is skipped
            }

            System.out.println(i); //1235

        }

        System.out.println("---------------------------------------------------------------");

        for (int i = 10; i < 21; i++) { //iteration 10~20

            if (i % 2 == 0) { // if the number evenly divisible by 2 is equal to zero; if 'i' is an even number
                continue; // skips the current iteration
            }

            System.out.println(i); //11 13 15 17 19

        }

        System.out.println("---------------------------------------------------------------");

        for (char i = 'A'; i <= 'G'; i++) { //i: A, B, C, D, E, F, G

            if (i == 'B' || i == 'E') { // either B or E can make the continue statement true -> loop can skip B or E
                continue;

            }

            System.out.println(i); //ACDFG


        }

        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < 10; i++) { //without curly braces the loop will be repeated the 2nd print statement one time
            System.out.println("Hello World");
            System.out.println("Hello Cydeo");
        }

        System.out.println("---------------------------------------------------------------");

//Find the sum of all the even numbers between 50~100! 3 different solutions.

        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i +" "); //printing in the same line
            }

        }
        System.out.println(); //new line is printed

        for (int i = 50; i < 101; i += 2) { //each time 50 increases by 2:; even numbers in order of precedence: 50,52,54,56...100
            System.out.print(i+" ");
        }

        System.out.println();

        for (int i = 50; i < 101; i += 2) { //even numbers in order of precedence: 50,52,54,56...100

        }
//You can choose to skip the odd numbers between 50~100 -> it will leave you the even numbers

        for (int i = 50; i < 101; i++) {
            if (i % 2 != 0) {// condition for odd number: number is not divisible by two.
                continue; //to skip the odd numbers; if this condition is not true: i`s value is even number.


        }
            System.out.print(i+" ");

            }

        System.out.println();
        }
    }
/*
Continue statement jumps to the next iteration. Continue is the skipping command.
Whenever the loop is under the condition i=4, then any code fragment, that is given in this iteration will not get
executed. -> 4 is skipped. It just jumps to the next iteration.

Display every single odd numbers between 10~20!
Choose to skip the even numbers. Before printing the i, I can give the condition to skipping the even numbers.

Display the characters from A~G by skipping the 2nd and 5th iteration!
1st way: 2 continue statements.
2nd way: 1 continue statement with the or operator.
i == 'B' || i == 'E'
Char data type has only one character. This one character can not be B and E at the same time (impossible condition).
-> We have to use the or operator || and not the and operator &&. 'i' is going to be either one of them during each
iteration. 'i' can not be more than one character in each iteration.
I need to make sure, that the continue statement can be executed for the character B and for the character E.

Every single task has multiple solutions.
*/