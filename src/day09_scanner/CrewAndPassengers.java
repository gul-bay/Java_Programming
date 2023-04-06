package day09_scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int number = 100;

//If Statement solution in GitHub under day07

        String result1 = (number == 50 || number == 75 || number == 100)? //The number has to be valid number.-> create pre-condition
                         (number == 50)? "20 crew, 30 passengers"
                        : (number == 75)? "25 crew, 50 passengers"
                        : "30 crew, 70 passengers"
                        : "Invalid" ;

        System.out.println(result1);

        System.out.println("----------------------------------------------------------------------------------------------------------------");

String result2 = ""; //if you are not sure that the variable will be set, therefore give some temporary value;

        switch(number){ //the switch statement checks the expression is equal

            case 50:
                result2 = "20 crew, 30 passengers";
                break;

            case 75:
                result2 = "25 crew, 50 passengers";
                break;

            case 100:
                result2 = "30 crew, 70 passengers";
                break;

            default:
                result2 = "Invalid";
                break;


        }

        System.out.println(result2);

        System.out.println("----------------------------------------------------------");

        System.out.println(2 * 3 + 2); //multiplication has a higher order of precedence ->  2 * 3 = 6 + 2 = 8
        System.out.println(2* (3 + 2)); //parantheses have higher order of precedence ->  2 * 5 = 10


        }

}

/*
Create a class named CrewAndPassengers
		Given a number of people on the ship (int number)
		determine how many need to be crew members and how many can be passengers.
		Print how many of each type there should be.

                Total: 50  ====> 20 crew, 30 passengers
                Total: 75  ====> 25 crew, 50 passengers
                Total: 100 ====> 30 crew, 70 passengers
                Any other number of people on the ship is not valid

                Solution1: Use ternary. Do not use more than one println()
                Solution2: Use switch statement. Do not use more than one println()
 */