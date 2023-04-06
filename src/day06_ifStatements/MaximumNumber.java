package day06_ifStatements;

public class MaximumNumber {

    public static void main(String[] args) {

        int num1 = 10,
            num2 = 100;

        if(num1 > num2){  //Single If Statement for one possible output.
            System.out.println(num1 + " is the maximum number");  // false
        }

        if(num1 < num2){
            System.out.println(num2 + " is the maximum number");  // true; this statement gets executed
        }

        if(num1 == num2){
            System.out.println("Equal");  // false
        }


    }
}
