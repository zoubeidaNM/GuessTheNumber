package com.company;

/* Program CommentsAssignment
*  Zoubeida Triki,
*  October 10th, 2017
*/

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //create a new Random class to generate a random number
        Random random = new Random();
        int from = 1;
        int to = 100;
        int randomNumber = random.nextInt(to - from + 1) + from;

        // the number guessed by the user
        int guessedNumber = 0;

        //tell the user the number limits (between from and to )
        System.out.printf("The number is between %d and %d.\n", from, to);

        //loop until the user guesses the right random generated number
        // get the user input and tell him if it is too high, too low or right
        do {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
    // write your code here
}
