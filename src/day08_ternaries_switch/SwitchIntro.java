package day08_ternaries_switch;

public class SwitchIntro {
    public static void main(String[] args) {

        //The grade has to be compared with other values. If you use the equal expression, then you apply the Switch Statement

        char grade = 'Q';

       /*
       You need to check if the grade is equal to
       A or
       B or
       C or
       D or
       F
       Whenever the grade is equal to a value, then we have to print String.
       If the grade is
       A: Excellent
       B: Great Job
       C: Good
       D: Passed
       F: Failed

       Benefit of Switch Statement is it operates faster than the If Statement
*/
        System.out.println("----------------------------------------------------------------------------------------------------");
//Switch Statement is used for finding the exact matching data.


        switch(grade){ //the data type grade value is char, therefore the case value -> char data type.

            case 'A':      //component of the Switch; provide case value, which has to be the same value of the switch expression.
                System.out.println("Excellent");
                break;     //closing the case block; the switch is exited

            case 'B':       //every single case has a unique value; it can not be duplicated.
                System.out.println("Great Job");
                break;     //no break statement means continuing with the next blocks

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");
                break;                  //recommended to place the default block at the end. You do not have to give the break statement at the last block

//what if no case is matching? Switch Statement executes automatically default block
//There is no order needed in Switch Statement



        }






 /*       char grade = 'B'; //
        String result = "";

        if(grade == 'A'){
            result = "Excellent";
        }else if(grade == 'B'){
            result = "Great job";
        }else if(grade == 'C'){
            result = "Good";
        }else if(grade == 'D'){
            result = "Passed";
        }else{
            result = "Failed";
        }
        System.out.println(result);

  */









    }
}
