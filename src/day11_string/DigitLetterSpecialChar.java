package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
/* If you want to use the Scanner object one time to get the String input, you don`t need to assign it to a variable,
if you don`t want to reuse it.
First I create the Scanner object. Then from the Scanner object I can write the method, that can get the String input right away.
This Scanner object is being used only one time.
You don`t need to use the close method.
*/

       if(str.length() >= 1){ //if the string has at least one character

           char f = str.charAt(0); //the first character of string, index number is zero

           //if(f >= 48 && f <= 57){
           if (f >= '0' && f <= '9'){
               System.out.println("first character is digit");
/*the number as character -> when you use the relational operator the number will be compared
The number of '0' is 48
If the String has at least one character (if the pre-condition is true), then I have 4 conditions to create. -> multi-branch-if
Once we can check if the character is between 48~57 (ASCII table 0~9).
When you count the index number -> starts from zero.
When you count the character -> starts from one
*/
           }else if(f >= 'A' && f <= 'Z'){
               // (f >= 65 && f <= 90)
               System.out.println("first character is uppercase letter");
           }else if(f >= 'a' && f <= 'z'){
               // (f >= 97 && f <= 122)
               System.out.println("first character is lowercase letter");
           }else{
               System.out.println("first character is special character");
           }


       }else{ //if string is empty
           System.out.println("String is empty"); //if the pre-condition is false

       }
/* We ended up Nested If here.

 */







    }
}
/*
Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table

 */