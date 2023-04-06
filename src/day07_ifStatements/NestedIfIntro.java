package day07_ifStatements;

public class NestedIfIntro {
    public static void main(String[] args) {



            int score = -300; //2 Conditions depends on another Condition

            if(score >= 0 && score <= 100){ //if the score is valid; valid score between 0~100 -> pre-condition, sub-conditions
                //If pre-condition is met, it also has to check the sub-conditions
                //How many possible scenario do we have for sub-conditions between 0~100?

                if(score >= 60){ //if the score is greater or equal to 60; This If Statement depends on the condition of another If Statement.
                    System.out.println("Passed");
                }else{ //if the score less than 60; The else block has the opposite condition of the if block
                    System.out.println("Failed");
                }
            }else{ // if the score is not valid
                System.out.println("Invalid Score"); //opposite of pre-condition
            }

//One If Statement is created inside another If Statement.
/*
 Find out if the student Passed or Failed!
 */



            System.out.println("-------------------------------------------------------------------------------------------------------------------");

            int age = -200; // valid age range 1 ~ 150

            if(age >= 1 && age <= 150){

                if(age >= 21){
                    System.out.println("Eligible");
                }else{
                    System.out.println("Not Eligible");
                }
            }else{
                System.out.println("Invalid age");
            }

 /*
        Is the person eligible to buy alcohol or not?
 */

        System.out.println("-------------------------------------------------------------------------------------------------------------------");

         int day = 100; /*considering the pre-condition would be the best choice Monday ~ Sunday
          Our expected result is between Monday ~ Sunday; we can create 7 conditions; we must have the numbers between 1~7.*/

         if(day >= 1 && day <= 7){ /*This can be the pre-condition. If the pre-condition is true, then there is a chance that you get Monday, Tuesday etc. If the pre-condition is not true -> Invalid Day
                                     outer if statement*/
             if(day == 1){ // inner if statement
                 System.out.println("Monday");
             }else if(day == 2){
                 System.out.println("Tuesday");
             }else if(day == 3){
                 System.out.println("Wednesday");
             }else if(day == 4){
                 System.out.println("Thursday");
             }else if(day == 5){
                 System.out.println("Friday");
             }else if(day == 6){
                 System.out.println("Saturday");
             }else{
                 System.out.println("Sunday");
             }

         }else{ // if the pre-condition is failed
             System.out.println("Invalid Day");
         }

         /*Whenever you have pre-condition use Nested If Statement -> fast result
           Use Multi Branch If' only, if there is no pre-condition!*/

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");

























    }
}



