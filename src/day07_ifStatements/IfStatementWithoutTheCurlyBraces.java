package day07_ifStatements;

public class IfStatementWithoutTheCurlyBraces {

    public static void main(String[] args) {

        int age = 32;

        if(age >= 21){
            System.out.println("Eligible"); //The default scope of the If Statement will be one Statement.
        }else{
            System.out.println("Not Eligible");
        }

        System.out.println("--------------------------------------------------");

        if(age >= 21) System.out.println("Eligible"); //Without the curly braces the If-Block or any other blocks they can only carry one Statement in its body. Optional!
        else System.out.println("Not Eligible");


/*If the If-Block or any other blocks is going to including more than 1 Statement you should always give the curly braces.
  The only time that you don`t have to give the curly braces is if there is included only 1 Statement in the If-Block or in any other blocks.*/

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");


  /*
        int itemNumber = 1; // 1~3

        if(itemNumber ==1){ //more than 1 code fragments -> curly braces are a must
            System.out.println("Eggs");
            System.out.println("Orange");
        }else if(itemNumber == 2){
            System.out.println("Milk");
            System.out.println("Orange");
        }else{
            System.out.println("Apple");
            System.out.println("Cherry");
        }
  */

        System.out.println("------------------------------------------------------------------------");

        int day = 2; // 1~7

        if(day == 1) System.out.println("Monday"); //only 1 code fragment in it`s body; optional to give the curly braces
        else if(day == 2) System.out.println("Tuesday");
        else if(day == 3) System.out.println("Wednesday");
        else if(day == 4) System.out.println("Thursday");
        else if(day == 5) System.out.println("Friday");
        else if(day == 6) System.out.println("Saturday");
        else System.out.println("Sunday");

        //Recommandation: Always give/use the curly braces even there is only 1 code fragment. It is the best option!
        //If Statement without curly braces is not a good practice.









    }

















}

