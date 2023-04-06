package day07_ifStatements;

public class LoanApplication {

    public static void main(String[] args) {

        int salary = 30000,
                creditScore = 800;

        String result = ""; //temporary value, empty String; it will be replaced if one of the code blocks gets executed


        if(salary >= 45_000 && creditScore >= 700){
            result = "You are eligible for the loan"; //Update of the variable by using the assignment operator
        }else{
            result = "You are not eligible for the loan";
        }

        System.out.println(result); //after the value is replaced, you can print the value of the variable result

    }


}
/*
Create a class named LoanApplication. two variables named salary and createdScore are declared and given, write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700
 */