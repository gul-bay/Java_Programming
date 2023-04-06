package day11_string;

public class StringMethods3 {
    public static void main(String[] args) {

       // String word = "Java"; //false
        String word = ""; // true

        boolean r1 = word.isEmpty();
        System.out.println(r1);
        /* The length of the String is not equal to zero.
        If the length of the String is equal to zero, then the isEmpty() method returns you true. */

//--------------------------------------------------------------------------------------------------------------

    String str = "      ";

    boolean r2 = str.isEmpty();
    boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2); //false; contains spaces, is not empty
        System.out.println("r3 = " + r3); //true; not empty, but blank

//-------------------------------------------------------------------------------------------------

    String str1 = "Cydeo";

    String str2 = new String("Cydeo");
/* 2 different objects.
If I compare the characters of one String object with another String object -> I can use equals() method.
Ignores not the case sensitivity.
Both have the same characters, same cases. ->equals() method return me true
*/
        System.out.println(str1 == str2); //false

        System.out.println(str1.equals(str2)); //true

        String str3 = new String("cydeo");
        System.out.println(str2.equals(str3)); //false

//------------------------------------------------------------------------------------------------------------

    String s1 = "JAVA";
    String s2 = "java";

        System.out.println(s1.equals(s2)); // false

        System.out.println(s1.equalsIgnoreCase(s2));
        /* true;
        If the case sensitivity does not matter, use equalsIgnoreCase() method.
         */

//----------------------------------------------------------------------------------------------------

    String students = "Hasan Naran Sumeye Nataliia";

    /* Verify if the name Ahmad is included in the String.
Contains() method can not ignore the case sensitivity.
     */

    boolean hasAhmed = students.contains("Ahmad");
        System.out.println("hasAhmed = " + hasAhmed); //false


    String sentence = "My favorite programming language is JAVA";

  /*boolean hasJava = sentence.contains("java");
    System.out.println("hasJava = " + hasJava); //false
   */

/* To ignore the case sensitivity first you can use the toLowerCase() method or the toUpperCase() method
 to convert the String in lower case or upper case.
2nd the contains method to find out, if it is included in the String.
 */
    boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println("hasJava = " + hasJava); //true

//-------------------------------------------------------------------------------------------------------------

    String name = "Michael";

    boolean l = name.startsWith("Da");
    System.out.println("l = " + l); //false
        
    
    String url = "www.cydeo.com";
    
    boolean isValid = url.startsWith("www.");
        System.out.println("isValid = " + isValid); //true
        
    boolean t = url.endsWith(".com");
        System.out.println("t = " + t); //true

//-------------------------------------------------------------------------------------------------------

    String email = "CydeoSchool@gmail.com";

    boolean isGmail = email.endsWith("gmail.com");

    boolean isYahoo = email.endsWith("yahoo.com");

    boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail); //true
        System.out.println("isYahoo = " + isYahoo); //false
        System.out.println("isHotmail = " + isHotmail); //false

// If the domain is different, then all the given boolean return to false.






    }
}
