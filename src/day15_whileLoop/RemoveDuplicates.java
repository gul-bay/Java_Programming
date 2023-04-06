package day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbbcccc";

        String result = ""; // "abc"

        for (int i = 0; i < str.length(); i++) {
            /*          i<= str.length()-1
          i: representing index numbers of string str starting from zero till the last index number.
             */
            char each = str.charAt(i); // each character of the string str

            if(!result.contains("" +each)){ //If the string result does not contain the character of string str yet
                result += each; //then we will add the character to string result
            }
//Logic for removing the duplicates: If the character is not contained yet in the new string, then we will add it to the new string
        }

        System.out.println(result);






    }
}
/*
3. Write a program that can remove the duplicated characters from a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

I cannot change the String object 'aabbbcccc' because String is immutable.
I declare another temporary variable with the temporary value empty string "", to store the final result.
It should contain the new String abc.
I need to get every single character of the string starting from the first character to the last character
-> Using charAt() and the loop.
I will add every single character of the string str to the new string result, under the condition, that the character
will not be added yet. If the character is not added yet, I can add the character in the string result.
I will continue to add the characters from one string into the other string, under the condition if the character
is contained yet. If the character is already included, once you added again, you will get duplicated characters.
By using charAt() you can get each character of the string str.
2nd Step: Every character will be concatenated, if it is not included in the new string result.
We are only adding the character, that is not contained in the new string yet.



 */