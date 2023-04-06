package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Enter key left in the Scanners memory.

        System.out.println("Enter your age:");
        int age = input.nextInt();
        /* 45+Enter(for new line). In Java we are using for new line this escape sequence '\n'.
         As soon as I type the enter key after the age, it did not allow us to provide the full name.
        For the full name I used the nextLine(); method; which been used right after the other methods of Scanner.
        The nextInt method reads till the last digit starting from left to right. It is not able to read the enter key.
        This enter key will be left in the Scanners memory.
        Whenever a Scanner method is called, first they will check the Scanners memory.
        NextLine method is the only method that can read the enter key.
        If the nextLine method is being called, before it is going to ask the user to provide input, it first goes to check Scanners memory.
        If something is in Scanners memory by default it takes this data. In this case nextLine method takes the Enter key from the Scanners memory.
        This is set to the full name. For the full name it just printed enter.
        How can I solve this issue?
        Before I call this nextLine method I need to make sure that anything that is left in the Scanners memory are clear; it has to be clear.
        In the Scanner we do have one additional enter key. How can I clear this enter key out?
        I need to call the nextLine method of the Scanner, that can take that value.
        Before I ask the full name of the person, I had to clear out the enter key, by giving an additional nextLine method.
        As soon as I give this additional nextLine method, whatever is left in the Scanners memory after this nextInt, it is going to take.
        If there is nothing in te Scanners memory, then it will ask for input. However after this input we do have enter key that is left in the Scanner.
         */
        input.nextLine();
        /* This nextLine method takes out the enter key that is left in the Scanner.
        One nextLine method can clear out everything that is left in the Scanners memory.
        We will not reuse it; we do not have to assign it to a variable.
        Once the enter key is taken out, when we call the nextLine method again, right now the Scanner memory is empty.
        If the Scanner is empty, the nextLine method is going to look to the user input.
        Now it allows me to type the full name.
         */

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("full_name = " + full_name);












    }
}
