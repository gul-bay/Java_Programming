package utilities;

public class StringUtility {

    public static String reverse(String str){
        String reverse = ""; //to contain all the characters of the given String in reversed order

        for(int i = str.length()-1; i >= 0; i--){ // i: index numbers of the given String starting from last index to index zero
            reverse += str.charAt(i); //to get each character of the string starting from last index to index zero, then concat it to the reverse

        }

        return reverse; // return it from the method to use it later on

    }

}
/*
From now on if we want to create any custom method, that is related to the string, we can create them under the package
utilities. We can use them whenever we needed.
To use the method you can call it through the class name StringUtility. Since it is from different package it needs to be imported.
From the class name we call this reverse. Then we can pass a string, any string that we want to reverse.
Then it is going to give us the new string, which will be the new version of the given string.

This custom method I would not able to create it if I did not know the for loop. Because we never know what kind of string,
that will be provided to the method; string may have 100 or 200 characters.
Regardless of how many characters does the string has in the argument can this for loop be able to get every single character
starting from the last index to index zero. This loop can do it for me. It can repeatedly get me each character.
After I get each character in the reversed order I can store it into another string named reverse.
If you want to know the details of the string reverse you can check the StringReverse class that is created under package day14.
 */




