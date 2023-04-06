package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // To declare a variable is not necessary if you want to use the data for one time.

        System.out.println("Enter the day number:");
       //int num = new Scanner(System.in).nextInt();
       //the data will be stored into a garbage collector/ garbage collection
        int num = input.nextInt();
        //Ternary is the shortest solution
        String day = "Invalid";  //Declare the variable first

        if(num >= 1 && num <= 7){

            day = (num == 1)? "Monday" :(num == 2)? "Tuesday" :(num == 3)? "Wednesday" :(num == 4)? "Thursday" :(num == 5)? "Friday" :(num == 6)? "Saturday"
                    : "Sunday";

            System.out.println(day);

            input.close();




        }















    }
}
