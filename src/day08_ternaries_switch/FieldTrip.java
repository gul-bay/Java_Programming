package day08_ternaries_switch;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 6;

        String location = "Unknown"; //extracting the data one by one; temporary value; assume that the grade number is invalid; if the user provides invalid grade number
        int numOfGroups = 0;
        String teacher = "Unknown";

        if(grade >=1 && grade <=6){ //if the user provides a valid grade; Nested If (outer If Statement); pre-condition

            if(grade == 1){ //Multi Branch If (inner If Statement)
                location = "Apple orchard"; //If the pre-condition is true and condition is true, we can reassign the variable based on the requirement.
                numOfGroups = 3;
                teacher = "Ms. Smith";

            }else if(grade == 2){ //If the grade is 2, the variables have to reassign.
                location = "Zoo";
                numOfGroups = 7;
                teacher = "Mr. Lee";

            }else if(grade == 3){
                location = "Aquarium";
                numOfGroups = 5;
                teacher = "Ms. Wilson";

            }else if(grade == 4){
                location = "Movie Theater";
                numOfGroups = 2;
                teacher = "Ms. Reyes";

            }else if(grade == 5){
                location = "Museum";
                numOfGroups = 5;
                teacher = "Ms. Lela";

            }else if(grade == 6){
                location = "Six Flags";
                numOfGroups = 8;
                teacher = "Mr. Watt";
            }else{ //grade 6
                location = "Unknown";
                numOfGroups = 0;
                teacher = "Unknown";
            }

        }

        System.out.println("location = " + location);
        System.out.println("number of roups = " + numOfGroups);
        System.out.println("teacher in charge = " + teacher);



















    }
}
/*
Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	number of groups - 0
			        	teacher in charge - Unknown


 */