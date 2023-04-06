package day07_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {

        int gradeLevel = 7; // The gradeLevel can be any number between 1~18. This is the pre-condition.

        String result = ""; // creating a String variable just to store the value.

        if(gradeLevel <= 5){ //or gradeLevel < 6; false: gradeLevel >= 6 -> false, the 2nd condition/next code block will be executed
            result = "Elementary School";
        }else if(gradeLevel >= 6 && gradeLevel <= 8){
            /*false: gradeLevel >= 9. In Multi Branch If Statement the 2nd condition only gets executed if the first condition is false
            The first blocks condition gets false if the boolean expression gradeLevel >= 6. So we have not to write in the 2nd condition (gradeLevel >= 6);
             it will be given by default by the previous block to this block.
             */
            result = "Middle School";
        }else if(gradeLevel <= 12){
            /*false: gradeLevel >= 13. Only gets executed if Condition1 & Condition2 are false.
             The default Condition2 (gradeLevel >= 9) will be given by default to the 3rd block.*/
            result = "High School";
        }else if(gradeLevel <= 16){ // false: gradeLevel >= 17; only gets executed if Condition1,2,3 are false
            result = "College";
        }else{
            result = "Grad School"; // only gets executed if C1,2,3,4 are false
        }
        System.out.println(result);



    }
}
/*
Create a class named GradeLevel.java
An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Note: Assume that the given number is between 1 ~ 18

 */