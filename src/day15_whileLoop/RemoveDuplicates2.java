package day15_whileLoop;

public class RemoveDuplicates2 {
    public static void main(String[] args) {

        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length() ; i++) { //iteration from index zero till last index.

            if(result.contains("" + str.charAt(i))){ // if the character is already contained in the new string
                continue;// then it skip it.
            }

            result += str.charAt(i);        //every single character of the string we added into the new string result.

            
        }

        System.out.println(result); //xyz


    }
}
/*
Write a program that can remove the duplicated characters from a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

output: xyz

We will add the characters one by one to the new string. If the character is still in the new string, we will skip it.
Command for skipping with the continue statement.
contains() needs a string. charAt() gives a string. -> By concatenation to an empty string, it returns string.
 */