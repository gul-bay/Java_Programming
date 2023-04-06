package day12_customMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        maxNum(10000, 5000); //first number will be assigned to the variable num1, 2nd number to num2.
        maxNum(10.5, 20.5); // Which our conditions is true, this will be executed.
        maxNum(15000, 16000);
        maxNum(-200, -20);

        System.out.println("---------------------------------------------------------------------------------");

        initial("Cydeo", "School"); //C.S
        initial("Mohammad", "Karim"); //M.K
        initial("Hasan", "Ayhan"); //H.A
        initial("Java","Programming"); //J.P


    }
/*
Create a method that can print the maximum number between 2 numbers! if both are equal then it prints "Equal".
'Must have information' for this method: 2 parameters num1, num2

Data type: double; I can also assign integer to that value.
3 possible conditions, scenario -> multi-branch if statement.
If you store the group of code fragments in the method, you can use it to any 2 numbers as many times as you want by
calling the method.
Otherwise, if you don`t have this custom method and write the code by yourself -> not reusable
Benefit: avoid duplications
 */
    public static void maxNum(double num1, double num2){

        if(num1 > num2){
            System.out.println(num1 + " is maximum number");
        }else if(num2 > num1){
            System.out.println(num2 + " is maximum number");
        }else{
            System.out.println("Equal");
        }

    }

/*
Create a method that can display the initials of a person!
'Must have information' for this method: the method needs 2 parameters (firstname, lastname)
firstname = "Cydeo"; lastname = "School -> initial ==> C.S
first character of each will be concat to a dot.
Based on the requirement of the function: Data type should be String.
No extra parameters, that are not needed! If you don`t give the right code fragment, then the function can not perform
its task.

 */

    public static void initial(String firstName, String lastName){
        String initial = firstName.charAt(0) + "." + lastName.charAt(0); //code fragment that can return the initial

        System.out.println("initial is: " + initial); //concatenation result is printed


    }




}
