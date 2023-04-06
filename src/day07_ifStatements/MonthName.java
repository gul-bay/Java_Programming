package day07_ifStatements;

public class MonthName {
    public static void main(String[] args) {

        int number = 4;

        String result = "";

        if(number == 1){
            result = "January";
        }else if(number == 2){
            result = "February";
        }else if(number == 3){
            result = "March";
        }else if(number == 4){
            result = "April";
        }else if(number == 5){
            result = "May";
        }else if (number == 6){
            result = "June";
        }else if (number == 7){
            result = "June";
        }else if (number == 8){
            result = "August";
        }else if (number == 9){
            result = "September";
        }else if (number == 10){
            result = "Oktober";
        }else if (number == 11){
            result = "November";
        }else{
            result = "December";
        }

        System.out.println(result);

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");

        //Better solution:

        int n = 12;

        String month = "";

        if(n >=1 && n <= 12){ /*12 possible outcomes; when the pre-condition is failed we get the one outcome "No such a month";
                                In this case the 12 possibilities do not need to be checked.*/

            if(n==1){ //This Multi Branch If Statement is one Statement
                System.out.println("January"); //or optional without curly braces: if(n==1) month = "January";
            }else if(n==2){
                System.out.println("February"); //or optional: else if(n==2) month = "February";...
            }else if(n==3){
                System.out.println("March");
            }else if(n==4){
                System.out.println("April");
            }else if(n==5){
                System.out.println("May");
            }else if(n== 6){
                System.out.println("June");
            }else if(n==7){
                System.out.println("July");
            }else if(n==8){
                System.out.println("August");
            }else if(n==9){
                System.out.println("September");
            }else if(n==10){
                System.out.println("October");
            }else if(n==11){
                System.out.println("November");
            }else{
                System.out.println("December");
            }




        }else{
            System.out.println("No such a month"); //when the pre-condition is failed we get this outcome
        }






















    }
}
/*
Create a class named MonthName.java
An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents.
Ex:
Given:
number = 10
output:
October
Note: Assume that the given number is between 1 ~ 12

 */