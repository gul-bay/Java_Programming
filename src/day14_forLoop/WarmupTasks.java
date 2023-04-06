package day14_forLoop;

public class WarmupTasks {

    public static void main(String[] args) {

      String str3 = combine("one", "eight");
        System.out.println(str3); //oneight
//java, apple ==> javapple

     String s1 = "" + true; //"true"

     String s2 = "" + 'e'; // "e"


        System.out.println("---------------------------------------------------------------------------");

    }

    public static String combine(String str1, String str2){

        String result;

/*Second solution:
        if(str1.charAt(str1.length()-1) == str2.charAt(0)){  //if the last character in the first string is equal to the first character of the second string
            result = str1 + str2.substring(1); //first character of the 2nd string should be excluded in the concatenation.
        }else{
            result = str1 + str2;
        }
*/
// First solution:
if(str1.endsWith("" + str2.charAt(0))){

        /*                              "e"
  If the first String ends with the first character of the second String
 */

        }else{
    result = str1 + str2;
     }
/*                              "e"
If the first String ends with the first character of the second String
 */

          result = str1 + str2.substring(1);





     return result;



        }



    }




/*
Task1:
	    Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight
*/













/*	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers
 */