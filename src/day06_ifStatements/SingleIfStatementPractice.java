package day06_ifStatements;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number = 155;

        boolean isEven = number % 2 == 0;
        // even number can be divisible by 2 with remainder zero; if the number can be divided evenly.
        // evenly means the remainder of the number divided by 2 is zero
        //if the first condition is false, we create the opposite condition

        if(isEven){
            System.out.println("Even number"); //false
        }

        if(!isEven){
            System.out.println("Odd number");  //opposite of false will be printed/executed
        }

        System.out.println("----------------------------------------------------------------------------");

        if(number % 2 == 0){
            System.out.println("Even number");
        }

        if(number % 2 != 0){
            System.out.println("Odd number");
        }


    }


}
