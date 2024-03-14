
import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations, you number is correct!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your number is small. Try again:");
            } else {
                System.out.println("your number is big. Try again:");
            }
        }

        scanner.close();
        
    }
}


