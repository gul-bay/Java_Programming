package day10_string;

import java.util.Scanner; //import statement for the Scanner Class
import java.lang.String; //import statement for the String Class; you don`t need to give it.
import java.lang.System; //import statement for the System Class; you don`t need to give it.
/*The Classes in the lang package are imported implicitly every single time I call it.
In Java only the classes in the lang package are imported implicitly (such as String, System); compiler imported it for us.

The other packages should always be imported manually.
The Scanner Class can not be imported implicitly. When you use the Scanner Class you have to give the import statement manually
by yourself every single time.
 */
public class StringIntro {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String str = "Java";

    input.close();

    System.out.println("----------------------------------------------------------------------------------------------------");

    String s1 = "Cat";
    String s2 = "Dog";

    String s3 = "Cat";
    String s4 = "Cat";
/* I create 4 String objects.
Only 2 String objects are actually created in the String pool.
If we have already the String of text 'Cat' and when you create the same literal object again,
String pool does not accept duplicated String literals. -> Even though you have 3 String literal 'Cat' (same literal characters),
only one String literal object 'Cat' will be created in the String pool.
This one object will be shared by s1, s3, s4.
 */

        System.out.println(s1 == s2); //false
        System.out.println(s1 == s3); //true
        System.out.println(s1 == s4); //true
        System.out.println(s3 == s4); //true

        System.out.println("----------------------------------------------------------------------------------------------------");

    String str1 = new String("Java");
/* Creates 2 objects: 1. String pool, 2. in heap (outside String pool)
In the heap objects can be duplicated.
You need to store the text into the String object by using String literal within the paranthesis.
Everytime when I use String literal, "Java" will go to String pool because this is a literal.
The new keyword opens up a new memory inside the heap outside the String pool.
Technically speaking, when you use this new keyword to create the String object and when you paste the String literal within the paranthesis,
there are actually 2 objects are being created.
First it is going to create "Java" (String literal) in the String pool.
Second it is going to open up a new memory location in the heap; inside the heap there is also the same String of text "Java".
 */

    String str2 = new String("Java");

        System.out.println(str1 == str2); //false
/* When you use the equal operator to compare 2 objects, as long as the 2 objects are created by using the new keyword,
then they will never be the same object.
The new keyword is going to open up a new memory in the heap.
 */

        System.out.println("----------------------------------------------------------------------------------------------------");

    String t1 = "Python";
    String t2 = new String("Python");
    String t3 = new String("Python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t2); //false
        System.out.println(t3 == t2); //false


    input.close();

    }


}
