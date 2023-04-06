package day06_ifStatements;

public class IfStatementsIntro {

    public static void main(String[] args) {

        int number = -100;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        if(isPositive){
            System.out.println(number + " is positive number"); // number is not positive,no executed statement

        }

        // System.out.println(number + " is negative number"); //statement is not in the body of the if flock, depends not on a condition

        //System.out.println(number + " is zero"); //statement is not in the body of the if flock, depends not on a condition



        if(isNegative){
            System.out.println(number + " is negative number"); //this condition is true, so this if flock gets executed

        }

        if(isZero){
            System.out.println(number + " is negative number");

        }

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        int num = 100;

        if(num > 0){
            System.out.println(num+ " is positive number");

        }

        if(num < 0){
            System.out.println(num+ " is negative number");
        }

        if(num == 0){
            System.out.println(num+ " is zero");
        }


        }


    }


