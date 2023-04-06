package day11_string;

public class StringMethods2 {
    public static void main(String[] args) {

   String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

    sentence = sentence.replace("Python","Java"); //new String
        System.out.println(sentence);

//---------------------------------------------------------------------------------------------------------------
    String word = "java";
    //word = word.replace('a', 'e'); // "jeve"
     word = word.replace("a", "e"); //I can also paste the value as a String
        System.out.println(word);

//----------------------------------------------------------------------------------------------------------------

    String sentence2 = "I love Java, Java is cool";

    //sentence2 = sentence2.replace("Java","Python"); //I love Java, Java is cool.

    sentence2 = sentence2.replaceFirst("Java", "Python");
        System.out.println(sentence2); // I love Python, Java is cool.

//------------------------------------------------------------------------------------------------------------------

String sentence3 = "Java is fun, Java is cool, Java is amazing";

    /* Replace only the 2nd Java:
    sentence3 = sentence3.replace("Java", "Python"); -> replaces all 'Java' to 'Python'.
     */

    sentence3 = sentence3.replaceFirst(", Java", ", Python"); //the first matching one will be replaced.(", Java"...)
        System.out.println(sentence3); //Java is fun, Python is cool, Java is amazing

//----------------------------------------------------------------------------------------------------------------------

    String sentence4 = "I love Java Programming";

    String languageName = sentence4.substring(7,10+1);
/* To include the index number 10 add 1 or give the index number 11.
substring() method returns you a new String.
If you want this new String to assign it to a variable, you can assign it to a new variable.
 */
        System.out.println(languageName); // Java

//----------------------------------------------------------------------------------------------------------------------

   String sentence5 = "Today is Sunday, tomorrow is Monday";
   //                  0123456789...
   String today = sentence5.substring(9,14+1);
        System.out.println(today); // Sunday

//----------------------------------------------------------------------------------------------------------------------

   String email = "CydeoSchoolJavaProgramming@yahoo.com";

/* Write a program to get the domain of the email!
You need to create a substring, that you get the domain.
Domain is places right after @ sign.
You need to find te index number of @ and add one on top of it, then you get the index number, which is the first character of
that domain of the email.
*/

   int beginning = email.indexOf('@') +1;
   int ending = email.lastIndexOf('.'); //the last index number will be excluded.

   String domain = email.substring(beginning,ending);

        System.out.println(domain); //yahoo

//-----------------------------------------------------------------------------------------------------------------------------

    String sentence6 = "I love Java programming";

    /* String r1 = sentence6.substring(7, sentence6.length());
                                       sentence6.length() -1 + 1 =0.
                                       sentence6.length();
    You can just paste the length.
     last index number is length()-1, but last index number is excluded.
     To add the last index number you had to add one. */

        String r1 = sentence6.substring(7); //by pasting the beginning index only.

        System.out.println(r1); //Java programming

//------------------------------------------------------------------------------------------------------------

    String sentence7 = "Today is Sunday, Tomorrow is Monday";

    /* Give tomorrow s name!
    The name is before the last space.
     */

   String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ') +1);
        System.out.println(tomorrow); // Monday

//----------------------------------------------------------------------------------------------------------

    String sentence8 = "I study at Cydeo School";

    //Give the school name!

   String schoolName = sentence8.substring(11);
        System.out.println(schoolName); //Cydeo School

        System.out.println("-----------------------------------------------------------------------------------------");

    String str = "Python";

    // Repeat str 10 times back to back!

   String result = str.repeat(10);
        System.out.println(result); //PythonPythonPythonPythonPythonPythonPythonPythonPythonPython

   /* Write 'Python' in 10 different lines!
   After the concatenation you can use the repeat() method.
   Make sure that the concatenation is completed and then call the repeat method.
   The concatenation gives you String, that is repeated 10 times.
    */

   String result1 = (str + "\n").repeat(10);
        System.out.println(result1);















    }
}
