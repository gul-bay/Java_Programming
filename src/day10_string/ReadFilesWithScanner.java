package day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

       Scanner scan = new Scanner(Path.of("src/day10_string/Test.txt"));
       // This Scanner will be used for reading the file. It has the capability to read the file.

        /*System.out.println(scan.next()); // if you want to read in the first line, the first word of the text file.
        System.out.println(scan.next());   //if you want to read in the second line the first word of the text file.
        System.out.println(scan.next());   //if you want to read in the third line the first word of the text file. */


        /*System.out.println(scan.nextLine()); //if you want to read the first entire line of the text file.
        System.out.println(scan.nextLine()); //if you want to read the second entire line of the text file.
        System.out.println(scan.nextLine()); //to read the third line.*/

        System.out.println(scan.next()); //if you want to read word by word; (the first word in the line)
        System.out.println(scan.next()); //if you want to read the next 2nd word
        System.out.println(scan.next()); //if you want to read the next 3rd word
        System.out.println(scan.next()); //if you want to read the next 4th word
        System.out.println(scan.next()); //if you want to read the next 5th word
        System.out.println(scan.next()); //if you want to read the next 6th word

        System.out.println("-------------------------------------------------------------------------------------");
        /* What if I have anything in this text file?
        "No Such Element Exception" -> There is no element that can be read by this next() method.
         */

        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println(scan.hasNextLine()); //means: Is there a readable line?
        System.out.println(scan.hasNext()); //means: Is there a single, readable word?
/* It is returning you true, as long as there is a word that can be extract by using the next() method.
 Otherwise, it returns you false.
 */




        scan.close(); //close method








    }
}
