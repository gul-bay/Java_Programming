package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){ // If the credentials are valid, correct
            System.out.println("Logged in");
        }else{ //otherwise

            for (int i = 0; i < 3; i++) {
                if(i !=2){
                    System.err.println("Incorrect username or password. Please re-enter");
                }else{
                    System.err.println("This is your last attempt. Please re-enter your username and password");
                }

                /* The for loop will be repeated for 3 times. This condition becomes true, when i: 0, 1, 2.
                For those i`s value, the loop will be repeated.
                When i`s value gets 2, we need to give a hard warning.
                If i`s value is not equal to 2, then we continue to print the statement:...Please re-enter.
                If 'i' already reaches the value 2, we need to print: 'This is your last attempt'
                 */

                System.out.println("Enter your username:");
                u = input.next();

                System.out.println("Enter your password:");
                p = input.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon")){ //break condition
//If the user enters valid credentials
                    System.out.println("You are logged in");
                    break; //then the break statement exits the loop.
                }


            }

            if(! (u.equals("Cydeo") && p.equals("WoodenSpoon"))){ // if the credentials are invalid
                System.err.println("Your account now is locked. Please contact with the support team.");
            }


        }

        input.close();





    }
}
/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
        username: Cydeo
        password: WoodenSpoon

        Ask the user to enter their credentials.
        If credentials are matched, your program should print "Logged in."

        If the credentials are not matched, the program should allow
        the user to have three attempts to enter correct credentials

        if all three attempts are failed, then print "Your account is locked."

Username and password must match with the ones, that are stored in the database. -> Logged in.
Otherwise, you will have 3 attempts. The iteration can not be more than 3. -> for loop gives 3 attempts to the user.
2 possible outputs: correct or incorrect username and password.
When the for loop gets executed it means -> invalid entry.
As soon as the user enters username -> I can assign the user entry to the variable u, which was declared to contain
the user entry username.
If the first user entry is correct, then we need to stop the loop forcefully. ->
We can create the break condition for breaking the loop: If username is equal to Cydeo and password is equal to
WoodenSpoon.-> user is logged in.
Then I need to make sure, that the remaining iteration of the for loop should not be executed anymore. -> break.
When the loop 1st gets failed, then the loop will be repeated a 2nd time. The 2nd time the if statement will be checked
again, to see if the user is provided a valid credential or not. If they are incorrect, the f.l. will be executed 3rd
time. After the 3rd iteration we don`t have any more iteration.
If all 3 attempts are failed, then the account is locked.

Give a hard warning to the user, whenever the last attempt is reached!
For the 3rd attempt display the message "This is your last attempt".
*/
