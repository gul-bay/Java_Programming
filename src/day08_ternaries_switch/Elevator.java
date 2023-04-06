package day08_ternaries_switch;

public class Elevator {
    public static void main(String[] args) {

             //Nested If Statement
/*        int floorNumber = 10; //we had to check out if this floor number exists
        if(floorNumber >= 1 && floorNumber <= 3){ //we have 3 floors; we can create this pre-condition

            if(floorNumber == 1){ //Multi Branch If
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            }else if(floorNumber == 2){
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            }else{
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }


        }else{
            System.out.println("Invalid floor");
        }
*/
        System.out.println("-----------------------------------------------------------------------------");

        //Optimize the solution!
        int floorNumber = 2;

        String result = "Invalid floor"; //Declare a String variable named result. "Invalid floor" is only get executed if the pre-condition is false;
        //If we assign the "Invalid floor" to the String variable result, we do not need the else block.
        //This data will not be replaced if the pre-condition is false.

        if(floorNumber >= 1 && floorNumber <= 3){
            //if the pre-condition is true

            result = "Floor " +floorNumber+ " is selected. Companies: ";

            if(floorNumber == 1){
                result += "Lobby, Verizon, Starbucks";
            }else if(floorNumber == 2){
                result += "Cydeo, NASA, Intelsat";
            }else{
                result += "Lyft, BofA, Stake house";
            }


            }


        System.out.println(result);

        }


    }

/*
Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"
 */
