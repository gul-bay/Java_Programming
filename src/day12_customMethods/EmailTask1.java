package day12_customMethods;

public class EmailTask1 {

    public static void main(String[] args) {

   String email = "mike_tysonl@gmail.com";

   String first = email.substring(0, email.indexOf("_"));
        System.out.println(first); //mike

   String last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        System.out.println(last); //tyson

   String rest = email.substring(email.indexOf("@"));
   /* By default it will include until the end of the String.

    */
        System.out.println(rest); //@gmail.com


        System.out.println();

    email = last +"_" + first + rest;
        System.out.println(email);




    }
}
/*
Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */