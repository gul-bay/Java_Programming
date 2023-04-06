package day11_string;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";
/* The String variable str1 can only contain one data. You can not store more than one String.
THe last time I initialized this variable is in line 6 -> CYDEO SCHOOL
toLowerCase() method is not able to modify the String; it is immutable.
Once you create any String object you can not change it -> it creates a new String
I update the value of the variable str1 by reassigning it; I can assign it back to the variable str1.
Now it returns me the lower case version of the String because I assign it back to the new str1.
Both String objects are always and forever immutable.
 */
        str1 =str1.toLowerCase(); //cydeo school
        System.out.println(str1); //before update: CYDEO SCHOOL, after update: cydeo school

//-----------------------------------------------------------------------------------------------------------------------

    String str2 = "java programming";

    str2 = str2.toUpperCase(); //2nd String object: JAVA PROGRAMMING

        System.out.println(str2);

/* If you want to keep both String objects, you can assign the 2nd object to a new variable:
String str3 = str2.toUpperCase() ;
str3 is referencing to 'JAVA PROGRAMMING'
 */

//--------------------------------------------------------------------------------------------------------------------

        String word = "Wooden Spoon";

       word = word.toUpperCase(); //new String: WOODEN SPOON
        //first update

       word = word.toLowerCase(); //new String: wooden spoon
        //second update
        System.out.println(word);

//---------------------------------------------------------------------------------------------------------------------

    String str4 = "            Cydeo School";

    str4 = str4.trim(); // creates a new String excluding all whitespaces: "Cydeo School"

        System.out.println(str4);

//---------------------------------------------------------------------------------------------------------------------

    String sentence1 = "Today is Sunday, and we have Java Class";

    int index1 = sentence1.indexOf('w');
    /* indexOf() method checks the characters index number from left to right.
    index number returns an integer */
        System.out.println(index1); //21 -> 'w' is the 22 character in the String


    String s1 = "I love Java Programming";

    int firstA = s1.indexOf('a');
    // The index number from the first matching 'a' starting from left to right will be given.


        System.out.println(firstA); // index number of the first 'a': 8

    int secondA = s1.indexOf("a "); //10
    /* add sequence of characters after the 2nd 'a' to make the 2nd 'a' more unique.
    You will use the double quote. */

        System.out.println(secondA);


    String s2 = "Java Python JavaScript Cydeo Python";

    int a1 = s2.indexOf('a'); //first 'a'
        System.out.println(a1); //1

    int a2 = s2.indexOf("a Python");
        System.out.println(a2); //3

    int a3 = s2.indexOf("avaS");
        System.out.println(a3); //13

    int a4 = s2.indexOf("aS");
        System.out.println(a4); //15

//-------------------------------------------------------------------------------------------------------------------

    String w = "Java";

        System.out.println(w.indexOf('a')); //1
// index number gives me integer -> you can paste it in the print statement.
        System.out.println(w.lastIndexOf('a')); //3
//lastIndexOf() method checks the characters from right to left

    String w2 = "Java Python JavaScript Cydeo Python";
        System.out.println(w2.lastIndexOf('a')); //15
        System.out.println(w2.lastIndexOf('P')); //29











    }
}
