package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 1000;
        int b = 200;
        System.out.println( a > b); // true
        boolean aIsGreater = a > b;
        System.out.println(aIsGreater);  //true

        System.out.println("--------------------------------------");

        int score = 75;
        boolean passed = score >= 60;
        System.out.println(passed); //true

        System.out.println("--------------------------------------");

        int age = 21;
        boolean eligibleToBuyAlcohol = age > 21;
        System.out.println(eligibleToBuyAlcohol);  //false

        boolean eligibleToVote = age >= 18;
        System.out.println(eligibleToVote); // true
        System.out.println(100 > 100); //false
        System.out.println(100 >= 100); //true
        System.out.println(100 >= 85); //true
        System.out.println(100 >= 185); //false

        System.out.println("-----------------------------------------");

        score = 48;
        boolean failed = score < 60;
        System.out.println(failed);  //true

        System.out.println("------------------------------------------");

        System.out.println(100 < 2000); // true
        System.out.println(100 < 20);  //false

        System.out.println("------------------------------------------");

        System.out.println(95 <= 100); //true
        System.out.println(100 <= 100);  //true
        System.out.println(10 <= 5);  //false

        System.out.println("------------------------------------------");

        System.out.println('a' > 'b');  //Ascii Table corresponding nr
        //                  65 > 66    false

       // System.out.println("Java" <= "C#");
        // Compile Error; >, <, >=, <= only be applicable for numbers













    }
}
