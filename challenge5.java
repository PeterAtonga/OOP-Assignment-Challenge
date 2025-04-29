import java.util.Scanner;

public class challenge5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;
        int guess;

        System.out.println("Guess the secret number between 1 and 10:");

        guess = scanner.nextInt(); // First guess

        while (guess != secretNumber) { // Loop until correct
            System.out.println("Wrong! Try again:");
            guess = scanner.nextInt(); // Ask again
        }

        System.out.println("Congratulations! You guessed it!");

        scanner.close();
    }
}
