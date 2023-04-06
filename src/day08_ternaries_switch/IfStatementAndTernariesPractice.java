package day08_ternaries_switch;

public class IfStatementAndTernariesPractice { // mixed Ternary and If Statement together
    public static void main(String[] args) {

        int score = 90;

        String result = "";

        if(score >=0 && score<=100){

            result = (score >= 90) ? "A": (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
//the mixed version is advanced, readable and understandable at the same time
        }else{
            result = "Invalid Score";
        }

        System.out.println(result);

        System.out.println("--------------------------------------------------------------------------------------");

        //only Ternary result

        String result2 = (score >=0 && score<=100) ? //pre-condition
                (score >= 90) ? "A": (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F" // inner condition, inner If Statement
                : "Invalid Score";

        System.out.println(result2);
















    }




}
