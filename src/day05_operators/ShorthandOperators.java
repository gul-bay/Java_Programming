package day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int a = 20;
        System.out.println(a); // 20
        System.out.println(a); // 20

        a = 40;
        System.out.println(a);  //40

        a= 90;
        System.out.println(a); //90

        System.out.println("------------------------------------------");

        double balance = 100;
        balance += 1000;  //balance will be reassigned to the old value and the value that I added; balance = 100+1000
        System.out.println("balance = " + balance); //1100.0

        balance += 500; // balance = 1100 + 500
        System.out.println("balance = " + balance);
        
        balance += 10000;
        System.out.println("balance = " + balance);
        
        balance -= 1000; // balance = 11600 - 1000
        System.out.println("balance = " + balance);
        
        balance -= 5000;
        System.out.println("balance = " + balance);

        System.out.println("-------------------------------------------------------------------------------------------");

        double salary = 45000;
        salary *= 2; // salary = 45000 * 2
        System.out.println(salary);  //90000

        salary *= 3;
        System.out.println(salary); //270000

        System.out.println("-------------------------------------------");

        double eth = 4;
        eth *= 250;  // eth = 4 * 250
        System.out.println("eth = " + eth);  //1000
        
        eth /= 2;  // eth = 1000 / 2
        System.out.println("eth = " + eth);

        System.out.println("-------------------------------------------------");

        System.out.println("salary = " + salary);
        salary /= 2;
        System.out.println("salary = " + salary);

        System.out.println("-------------------------------------------------");

        int b = 39;
        b %= 7; // b= 39 % 7
        System.out.println(b); //Remainder 4

    }
}
