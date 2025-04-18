package Basics;
import java.util.Scanner;
import java.util.Random;

public class W2_NumberGuessingGame {

    public static void main(String[] args) {
        // TODO: Create Scanner and Random objects
        Scanner scanner = null;  // Replace null with actual Scanner
        Random random = null;    // Replace null with actual Random

        // TODO: Generate a random number between 1 and 100
        int secretNumber = 0; // Replace 0 with random number generation

        // TODO: Initialize variables for user's guess and number of attempts
        int guess = 0;
        int attempts = 0;
        final int MAX_ATTEMPTS = 7;

        // Print welcome message
        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it in " + MAX_ATTEMPTS + " tries?");

        // TODO: Start loop for guessing
        // Repeat while the user hasn't guessed correctly and hasn't used all attempts
        while (true) {
            // TODO: Ask user to enter a guess
            // TODO: Read the guess using scanner

            // TODO: Increase attempt count
            // TODO: Compare guess to secret number and give hint:
            //  - If guess is correct → Congratulate and break loop
            //  - If guess is too low → Print "Too low!"
            //  - If guess is too high → Print "Too high!"
            // TODO: If attempts == MAX_ATTEMPTS, reveal the number and end the game
        }

        // TODO: Close the scanner
        // Print goodbye message
        System.out.println("Thanks for playing!");
    }
}
