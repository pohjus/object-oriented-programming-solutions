import java.util.Scanner;

public class Main {
    private static final int maxGuess = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = generateSecretNumber(1, 100);
        int guess, count = 0;
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            count++;
            int result = checkGuess(guess, secretNumber);
            if (result == 1) {
                System.out.println("Too high! Try again.");
            } else if (result == -1) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the secret number in " + count + " tries.");
                break;
            }
        } while (count < maxGuess);
        if(count == maxGuess) {
            System.out.println("You reached the maximum number of guesses. Game over.");
        }
    }

    public static int generateSecretNumber(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }

    public static int checkGuess(int guess, int secretNumber) {
        if (guess > secretNumber) {
            return 1;
        } else if (guess < secretNumber) {
            return -1;
        } else {
            return 0;
        }
    }
}