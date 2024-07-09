package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click t
import java.util.Random;
import java.util.Scanner;

class NumberGuesser {

    public static void main(String[] args) {
        // Create an instance of Random to generate random numbers
        Random random = new Random();
        // Generate a random number between 1 and 100 (inclusive)
        int numberToGuess = random.nextInt(100) + 1;
        // Variable to store the user's guess
        int guess = 0;
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Loop until the user guesses the correct number
        while (guess != numberToGuess) {
            System.out.print("Guess a number between 1 and 100: ");
            // Read the user's guess
            guess = scanner.nextInt();

            // Compare the guess to the randomly generated number
            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
