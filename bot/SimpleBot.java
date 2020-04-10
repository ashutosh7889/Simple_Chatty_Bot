package bot;

import java.util.Scanner;

/**
 * This is simple bot class where we show the name of assistant,take the name of user,
 * calculate user age,throe the question in front of the user.
 */

public class SimpleBot {
    final static Scanner sc = new Scanner(System.in);// create the object of Scanner class.

    /**
     * This is a main method.
     * This method take the name and birth year of assistant and call the methods greet(),remindName(),guessAge(),count(),test() and end().
     *
     * @param args arguments for the main method..
     */
    public static void main(String[] args) {
        String assistantName = sc.nextLine(); //for the name of the assistant.
        String birthYear = sc.nextLine(); //for the birth year of the assistant
        greet(assistantName, birthYear); // call greet method
        remindName(); //call remindName method
        guessAge(); // call guessAge method
        count(); // call count method
        test(); // call test method
        end(); // call end method
    }

    /**
     * This is greet method.
     * This method print the assistant name and birth year and asking the name of the user.
     *
     * @param assistantName name of the assistant.
     * @param birthYear     birth year of the assistant.
     */
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + "."); // print the assistant name
        System.out.println("I was created in " + birthYear + "."); //print the birth year of assistant
        System.out.println("Please, remind me your name."); // asking the name of the user
    }

    /**
     * This is a remindName method.
     * This method take the name of user and print it.
     */
    static void remindName() {
        String userName = sc.nextLine(); // store the name of the user
        System.out.println("What a great name you have, " + userName + "!"); // print the name of the user
    }

    /**
     * This is a guessAge method.
     * This method calculating the age of the user by taking the remainder of by dividing 3,5 and 7.
     */
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = sc.nextInt(); // remainder of dividing user age by 3
        int rem5 = sc.nextInt(); // remainder of dividing user age by 5
        int rem7 = sc.nextInt(); // remainder of dividing user age by 7
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105; //calculate the age of the user
        System.out.println("Your age is " + age + "; that's a good time to start programming!"); //print the calculated age
    }

    /**
     * This is a count method.
     * This method taking the any integer number from the user and count that given number.
     */
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = sc.nextInt(); //asking the number from th user.
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i); //print the counting number upto asking number
        }
    }

    /**
     * This is a test method.
     * This method gives the question and associate options to user.
     * user give the answer as option number.
     * if the answer is correct then it completely out the method otherwise it wait for the correct answer.
     */
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?"); //asking the question from the user
        while (true) {
            System.out.println("1. To repeat a statement multiple times.");
            System.out.println("2. To decompose a program into several small subroutines.");
            System.out.println("3. To determine the execution time of a program.");
            System.out.println("4. To interrupt the execution of a program.");
            //these above are four option given to the user
            int answer = sc.nextInt(); // asking the answer from the user
            if (answer == 2) {  // check the answer
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }

    /**
     * This is a end method.
     * This method simply say congratulations to the user for giving correct answer.
     */
    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
