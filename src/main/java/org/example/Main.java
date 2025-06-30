package org.example;

import java.util.*;
/*
Create a simple number guessing game in Java. In this game:

The computer secretly picks a number between 1 and 5.

The player has 3 chances to guess the correct number.

After each guess, tell the player if they were correct or not.

If the player guesses right within 3 tries, display a "You win!" message.

If they use all 3 tries without guessing correctly, display "You lose. The correct number was X."
* */

public class Main {
    public static void main(String[] args) {

        int secretNumber = (int)(Math.random() * 5) + 1;
        int maxAttempts = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Gids Guessing Game!");
        System.out.println("Please pick a number between 1 and 5");
        System.out.println("You only have 3 tries");

        boolean isCorrect = false;

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.printf("Attempt " + i + " : ");

            int guess = scanner.nextInt();
            if (guess == secretNumber){
                isCorrect = true;
                break;
            }
            else {
                System.out.println("Incorrect guess. Please try again.");
            }
        }
        if (isCorrect) {
            System.out.println("Congratulations, you win!");
        }
        else {
            System.out.println("You lose. The correct number was" + secretNumber + ".");
        }
    }
}