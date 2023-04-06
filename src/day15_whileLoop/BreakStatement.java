package day15_whileLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {

            if(i == 6){ // if i`s value reaches 6
                break; // exits the loop -> printing 012345
            }

            System.out.println(i); //0123456789
            
        }
        System.out.println("----------------------------------------------------------------------------");

        for(char i = 'A'; i <= 'Z'; i++){

            System.out.println(i);

            if(i == 'J'){ //ABCDEFGHJ
                break;

            }

            System.out.println("--------------------------------------------------------------------------");

        for(;;){
            System.out.println("Hello"); //will be printed one time
            break; //terminates the infinite loop
        }
        }
        
    }
}
/*
If you want to use the break statement you need to have either switch or loop.
Our loop will get executed 10 times. The valid values, that makes this condition true, is between 0~9; because we
excluded the number 10. Execution: 0123456789 (listed under each other).
I don`t want to make change to the loops main condition.
I want to make sure, that right after 5 is printed, before printing the 6, the loop gets terminated.

I want to get the alphabet characters from A~Z.
The characters have also a number. You can also use it as the initialization of the loop.
In forward direction the iteration needs to be the increment operator. Each time we can increase the value of i by 1.
By using the break statement we are forcefully making the condition to false. Even it is true, the break statement is
going to force it to be false. -> loop gets terminated.
The break statement has to be in the loops body.
After the branching statements, such as break statement, you can not give any code fragments.
Whenever you have a conditional statement, that needs to forcefully exit the loop, then you can give this break
statement. We only use the break statement to exit the loop forcefully.
 */