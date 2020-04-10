package bot;

import java.util.Scanner;

/**
 * This is simple bot class where we show the name of assistant,take the name of user,
 * calculate user age,throe the question in front of the user.
 */

public class SimpleBot {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String assistantName = sc.nextLine();
        String birthYear = sc.nextLine();
        greet(assistantName, birthYear);
        remindName();
        guessAge();
        test();
        end();
    }

    /**
     * This is greet method.
     * This method print the assistant name and birth year and asking the name of the user.
     *
     * @param assistantName name of the assistant.
     * @param birthYear     birth year of the assistant.
     */
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    /**
     * This is a remindName method.
     * This method take the name of user and print it.
     */
    static void remindName() {
        String userName = sc.nextLine();
        System.out.println("What a great name you have, " + userName + "!");
    }

    /**
     * This is a guessAge method.
     * this method calculating the age of the user by taking the remainder of by dividing 3,5 and 7.
     */
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = sc.nextInt();
        int rem5 = sc.nextInt();
        int rem7 = sc.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    /**
     * This is a count method.
     * This method taking the any integer number from the user and count that given number.
     */
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
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
        System.out.println("Why do we use methods?");
        while (true) {
            System.out.println("1. To repeat a statement multiple times.");
            System.out.println("2. To decompose a program into several small subroutines.");
            System.out.println("3. To determine the execution time of a program.");
            System.out.println("4. To interrupt the execution of a program.");
            int answer = sc.nextInt();
            if (answer == 2) {
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }

    /**
     * this is a end method.
     * This method simply say congratulations to the user for giving correct answer.
     */
    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
