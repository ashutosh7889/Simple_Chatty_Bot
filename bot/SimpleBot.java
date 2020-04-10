package bot;

import java.util.Scanner;

/**
 * This is simple bot class where we show the name of assistant,take the name of user,
 * calculate user age,throe the question in front of the user.
 */

public class SimpleBot {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

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

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = sc.nextInt();
        int rem5 = sc.nextInt();
        int rem7 = sc.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
    }
}
