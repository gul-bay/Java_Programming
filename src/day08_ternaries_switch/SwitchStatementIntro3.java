package day08_ternaries_switch;

public class SwitchStatementIntro3 {
    public static void main(String[] args) {

        int score = 85;

        String result = "Your grade is: ";

        if(score >= 90){ //range score between 0 ~ 100; we are considering the pre-condition that is already given
            result += "A"; //Addition assignment to add some text to the String variable; if this condition is true, A will be concatenate at the String variable result.
        }else if(score >= 80 && score < 90){
            result += "B";
        }else if(score >= 70 && score < 80){
            result += "C";
        }else if(score >= 60 && score < 70){
            result += "D";
        }else{
            result += "F"; // if the result is not A, B, C, D -> the result must be F
        }

        System.out.println(result);

        //If you want to solve this Task as a Switch Statement, you need to create 100 case blocks.
        //In the If Statement you are able to give the range -> advantage of the If Statement over Switch Statement.

        //---------------------------------------------------------------------------------------------------------------

        //Solve with Switch Statement!

        int number = 5;

        String month = "";

        switch(number){

            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid");









        }







    }
}
