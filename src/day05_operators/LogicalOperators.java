package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 60000;
        int creditScore = 650;
        int age = 25;
        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >=18;
        System.out.println(eligibleForLoan);  //true

       // double salary = 90000;
       // int creditScore = 500;
       // boolean eligibleForLoan = salary >= 30000 && creditScore >= 650;
       // System.out.println(eligibleForLoan);  //true && false = false

        System.out.println("--------------------------------------------------------");

        age = 18;
        String country = "USA";
        boolean eligibleToVote = age >= 18 && country == "USA";
        System.out.println(eligibleToVote); //true

        System.out.println("--------------------------------------------------------");

        String answer = "maybe";
        boolean validAnswer = answer == "yes" || answer == "no"; // false || false = false
        System.out.println(validAnswer);

        //if the answer = "no" the result get true
        //if the answer = "yes" the result get true

        System.out.println("--------------------------------------------------------");

        char grade = 'B';
        boolean passedTheExam = grade == 'A' || grade =='B' || grade == 'C' || grade =='D';
        System.out.println(passedTheExam); //true

        //boolean passedTheExam = grade == 'A' && grade =='B' && grade == 'C' && grade =='D';   false

        System.out.println("--------------------------------------------------------");

        System.out.println(!true);  // not true = false

        String a= "yes";
        boolean yes = a == "yes"; //true
        boolean no = !yes; //false
        System.out.println("yes = " + yes); // yes= true
        System.out.println("no = " + no);  //no =

        System.out.println("--------------------------------------------------------");

        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);  //true
        System.out.println("failed = " + failed);  //false

        System.out.println("--------------------------------------------------------");

        System.out.println( true == !false && false == !true && true != !true ); //true
        //                      true       &&       true     &&       true




































    }




}
