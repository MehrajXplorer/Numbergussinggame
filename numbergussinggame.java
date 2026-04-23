import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain = true;

        System.out.println("🎯 Welcome to Number Guessing Game 🎯");

        while (playAgain) {
            int number = rand.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;
            int maxAttempts = 7;

            System.out.println("\nGuess a number between 1 and 100");
            System.out.println("You have only " + maxAttempts + " attempts!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess < number) {
                    System.out.println("📉 Too low!");
                } else if (guess > number) {
                    System.out.println("📈 Too high!");
                } else {
                    System.out.println("✅ Correct! You guessed in " + attempts + " attempts.");
                    break;
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (guess != number) {
                System.out.println("❌ Game Over! The number was: " + number);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String choice = sc.next();
            playAgain = choice.equalsIgnoreCase("yes");
        }

        System.out.println("👋 Thanks for playing!");
        sc.close();
    }
}
