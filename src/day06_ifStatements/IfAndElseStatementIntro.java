package day06_ifStatements;

public class IfAndElseStatementIntro {
    public static void main(String[] args) {

        int age = 28;

        if(age >= 21){
            System.out.println("Eligible");
        }

        if(age < 21){
            System.out.println("Not Eligible");
        }
    //not the best solution

        System.out.println("-------------------------------------");

        if(age>= 21){
            System.out.println("Eligible");
        }else{ // otherwise expression/condition
            System.out.println("Not Eligible"); //better solution
        }





    }
}






/*
Verify if the person is eligible to buy alcohol or not.
 */