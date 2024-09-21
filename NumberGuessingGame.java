import java.util.Scanner;

public class NumberGuessingGame {
    public static void guessingGame() {
        Scanner sc = new Scanner(System.in);
        int randomNumber = 1 + (int) (100 * Math.random());
        int trials = 5; // User has 5 trials
        int guessNumber;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have " + trials + " trials to guess the number.");

        for (int i = 0; i < trials; i++) {
            System.out.println("Trial " + (i + 1) + ": Enter your guess:");
            guessNumber = sc.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("Congrats! You guessed the number right.");
                break;
            } else if (guessNumber < randomNumber) {
                if (i != trials - 1) {
                    System.out.println("The number is greater than your guess.");
                }
            } else {
                if (i != trials - 1) {
                    System.out.println("The number is less than your guess.");
                }
            }
        }

        if (randomNumber != guessNumber) {
            System.out.println("You've used all " + trials + " trials.");
            System.out.println("The number was " + randomNumber + ".");
        }

        sc.close();
    }

    public static void main(String[] args) {
        guessingGame();
    }
}
