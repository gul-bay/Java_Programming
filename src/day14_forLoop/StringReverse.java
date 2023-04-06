package day14_forLoop;

public class StringReverse {
    public static void main(String[] args) {

        String str = "Java";
        //avaJ        0123

        String reverse = ""; //avaJ

       /* for(int i = 3; i >= 0; i--){ //backward direction; bug: the end index number of the string is limited to 3
            reverse += str.charAt(i);
         }
         System.out.println(reverse); //avaJ
      */


        for(int i = str.length() -1; i >= 0; i--){
            /* reversing the String from last index to index 0; each time decreasing by 1; applies to any string.
Starting from last index till index zero means reserve. */
            reverse += str.charAt(i);

        }
        System.out.println(reverse);

        System.out.println("--------------------------------------------------------------------------------");

        String name = "Ermek Keneshbekovich Apazov";

        String result = reverse(name);

        System.out.println(result);


    }

//custom method

    public static String reverse(String str){
        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);

        }

        return reverse;

    }

}
/*
Write a program that can reverse any given String!
Reverse means getting the characters from last index to index zero. -> 'Java'; final result 'avaJ'
If I want to reverse the string I should go in backward direction.
If I use the loop to getting each index starting from last index, my initialization should start from last index.
Last index is 3. As long as i>=0 -> the loop should be continued. 'i' is the index number.
In order to make this condition to be false during each iteration, the index number should be decreased by 1 each time i--
I want to get the data, which contains the reversed version of the string.
After you get the reserved version of the characters backwards, I need to store it into the String variable called reverse;
right now the string is empty "".
First time the character 'a' should be added into the reverse. 2nd time the next character backwards should be added into the string.
It should repeat until it reads the character at index zero.
If you can use this i to get each of the character from the string, how can I store each of the characters into this string?
You will do Concatenation. You will just add it into the string: reverse += str.charAt(i);
After this loop all the characters of this string will be added into the string reverse.
When you print out this variable reverse -> It will return the reverse version of the string Java.
The bug: This String has 4 characters, the index number is 3. What if the string I have is more than 4 characters?
I am not able to reverse it. If the string has different length how can I find the last index number?
The first index number will always be zero i>=0. The last index number should be: the length of the string -1; int i=str.length()-1.
This is how I create a for loop that can reverse the string. You will iterate the index numbers starting from last index
to index zero and each time you will decrease it by one.
Once you decrease it by one regardless what string you have now any string you can reverse it.
Because this logic applies to any string. In order to reverse any string starting from last index to index zero you will get the
characters by using charAt(). Then the characters you will concat it to another string. So that this string at the end
will contain the reversed version.
Right now regardless what your string is, it will always return you the reversed string.

What if I have 2 more other string in other place in my source code?
I should reverse it by creating a custom method.
If I am creating a custom method at the end I want to be able to return the reverse version of the string. Because I may use
it in other places later on. Whatever the reverse version of the string is I want to make it reusable from that method.
Return type needs to be string. The string has to be given. Therefor I need to pass a parameter.
I need to store the reverse version into the variable reverse. At the end I need to return this reverse version of the string.
How can I get each character of the given string starting from last index to index zero and then add it into the string?
The code fragment is going to iterate the given string starting from last index to index zero.
It is going to get each of the character. After getting each of the character it is going to add it into the variable reverse.
The variable reverse is going to contain every single characters of the string starting from the last index to index zero.
Now you do have a method that can reverse the string for you.
If you have another string, e.g the name of the person: You can just call the method reverse you already created.
The reverse method accepts a string.
Then it is going to reverse the string and returns you the reversed value.
Once I called this reversed method I can pass the string I wanted to reverse, which is name. Since the reverse method is
a return method it will return me a value -> You can also assign it to a variable: result.
If I print this variable now it contains the reversed version of this string.
So next time if you want to reverse any string you can just call this method to reverse it.

Create a custom package: utilities to store the custom methods of the string. -> easier for me to find and use it.
Create the class StringUtility.
 */