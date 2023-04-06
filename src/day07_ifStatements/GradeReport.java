package day07_ifStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 85; // 0~100

        String result = "";

        if(score >= 90){ // false: score < 90, then the next statement could get executed
            result += "A"; //
        }else if(score >= 80 && score < 90){
             /*false: score < 80; this condition gets only executed if the previous condition is evaluated to false
               This condition can be given by default to the next block in the Multi Branch If Statement.
               The score is already < 90; you can take it out from the 2nd blocks condition; it will be given by default*/
            result += "B";
        }else if(score >= 70 && score < 80){ //false: score < 70
            result += "C";
        }else if(score >= 60 && score < 70){ // false: score < 60
            result += "D";
        }else{
            result += "F"; // if the result is not A, B, C, D -> the result must be F
        }

        System.out.println(result);



        //2nd solution example: String result = ""; | System.out.println("Your grade is: " + result); -> looks much more shorter and clean

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");

     /* int score = 85;

        String result = "Your grade is: ";
Analyse the execution flow of this Multi Branch if statement:*/




    }
}
/*
Create a class named GradeReport.java
An integer variable named score is declared and given, Write a
program that can print the grade of the student
Ex:
score = 95
output:
Your grade is A
Note: Assume that the given score is between 0 ~ 100
*/