package day10_string;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {

    String str = "Cydeo";
    // index:     01234

     char firstChar = str.charAt(0);
     char secondChar = str.charAt(1);
     char thirdChar = str.charAt(2);
     char fourthChar = str.charAt(3);
     char fifthChar = str.charAt(4);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("---------------------------------------------------------------");

     String sentence = "Java Programming Language";

     int length = sentence.length();

        System.out.println(length); //25

     int lastIndex = length -1;

        System.out.println(lastIndex); //24


        System.out.println("---------------------------------------------------------------");

        String s1 = "Wooden Spoon";

        char f = s1.charAt(0); //first character

        int lastIndexNum = s1.length() -1;

        char l = s1.charAt(lastIndexNum); //last character

        System.out.println(f + " : "+ l);

        System.out.println("---------------------------------------------------------------");

        String name1 = "Umran";
        String name2 = new String("Umran");

        System.out.println(name1 == name2); //false
        System.out.println(name1.equals(name2)); //true, different objects with same value/same literals


        System.out.println("---------------------------------------------------------------");

        String r1 = "Java";
        String r2 = "Java";

        String r3 = new String("Java");


        System.out.println(r1 == r2);
        /* true; they have the same literal, one stored in the String pool
        r1 and r2 are referencing to the same object.
        I compare the String as an object, not as a value.
         */
        System.out.println(r1 == r3); // false;
        System.out.println(r2 == r3); //false

        System.out.println(r1.equals(r3)); //true; equals() method compares the text of the String
        System.out.println(r2.equals(r3)); // true; same text.

/* Starting from now on, if you want to compare 2 Strings values only (if you are not worry about if they are same object or not)
->use always this equals() method. Do not use == operator.
*/

        System.out.println("--------------------------------------------------------------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if(age >= 21 && answer.equals("yes")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

    input.close();








    }

}
