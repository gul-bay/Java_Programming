package day09_scanner;

import java.util.Scanner; // import_package name.subpackage.Scanner class(regular import); import statement of Scanner, that imports one class from the package
//import java.util.*;
        //Both allows you to use the Scanner; choose the one, which costs less in the end.

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     //Scanner object; for reading user inputs; input: reference name

        System.out.println("Enter a number: ");
        byte num1 = input.nextByte();
        /* When this line gets executed, it is waiting for the keyboard entry. Whatever the user types, it will return as a byte at the end.
          It is waiting for the user to provide an input.
          make the data reusable storing into a container,variable; a byte value*/
        System.out.println("You entered: "+num1);











    }


    }

/*
Declare Data Type and variable name (matching, meaningful name such as 'scan' or 'input')
Data Type to store Scanners object has to be 'Scanner'
Store the object of this variable to be able to use the functions of the Scanner.
To create the object of the Scanner you have to use the 'new' keyword.
Right after the new keyword, you have to give the class name 'Scanner' and parenthesis.
You have to specify for what reason you want to use  the Scanner object, either for the file or reading the keyboard entry.
If you want to use the Scanner to read the file, file object has to be passed here(-> future topic).
If you want to read the keyboard entry, you have to specify it as well. Keyboard entry means to be able to read my input, when I run my program.
System.in = to get the input on the console.
As long as there is a method of Scanner be called, the process is not finished, until you see the sentence 'Process finished with exit code 0'.
 */

