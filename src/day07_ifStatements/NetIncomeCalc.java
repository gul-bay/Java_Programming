package day07_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {

        int salary = 200000;
        boolean isMarried = true; //marriage status

        double taxRate = 0; //temporary value, decimal number

        if(salary >= 130_000){ // if the salary is 130K or more, then the tax rate should be 35%
            taxRate = 0.35; //35% / 100
        }

        if(salary >= 100_000 && salary < 130_000){ // if the salary is between 100K to 130K(excluded), then the tax rate should be 30%
            taxRate = 0.30; //30% / 100
        }

        if(salary >= 80_000 && salary < 100_000){ // if the salary is between 80K to 100K(excluded), then the tax rate should be 25%
            taxRate = 0.25;
        }

        if(salary < 80_000){ //if the salary is less than 80K(excluded), then the tax rate should be 20%
            taxRate = 0.20;
        }

        if(isMarried){ /* if the person is married
              tax is reduced by 5%; to reduce the taxRate by 5% we had to use the subtraction assignment operator*/
            taxRate -= 0.05; //tax is reduced by 5%; to reduce the taxRate by 5% we had to use the subtraction assignment operator
        }

        double totalTax = salary * taxRate;
       // double netIncome = salary * (1-taxRate); //calculation of net income; 1 is equal to 100%; you are only taking 75% of your salary as your net income
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);



    }

}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129,999K
                        25% for salary of 80K to 99,999K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax
 */