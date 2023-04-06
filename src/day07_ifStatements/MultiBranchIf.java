package day07_ifStatements;

public class MultiBranchIf {

    public static void main(String[] args) {

        int number = 50; // solution with Single If Statement-> at day06 PosNegZero

        String result = "";

        if(number >  0){
            result = "Positive";
        }else if(number < 0){
            result = "Negative";
        }else{                  //otherwise, if the number is not Positive (Condition1) or Negative (Condition2) we will get Zero (Closing Statement) executed
            result = "Zero";
        }

        System.out.println(result);






    }


}
/*
Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
Ex:
number = 20
output:
Positive
*/
