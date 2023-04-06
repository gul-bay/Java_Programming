package day01_introToProgramming;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String word = "Wooden Spoon";

        String result = StringUtility.reverse(word);

        System.out.println(result);

    }
}
/*
To use the method you can call it through the class name StringUtility. Since it is from different package it needs to be imported.
From the class name we call this reverse. Then we can pass a string, any string that we want to reverse.
Then it is going to give us the new string, which is the new version of the iven string.
 */