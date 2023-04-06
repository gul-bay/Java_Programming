package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for(int i = 5; i <= 10; i--){
            System.out.println("Hello Cydeo");
        }


        System.out.println("Hello World");

    }
}
/*
Double check the iteration! It has to be created based on the initialization.
The iteration has to be capable enough to make the condition false.
i-- -> 'Hello Cydeo' is printed infinite times.
'Hello World' never gets executed, if the loop is infinite.
When you create the loop you have to make sure that the loop is not an infinite loop.
 */