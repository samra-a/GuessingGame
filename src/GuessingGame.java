import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class GuessingGame {
    public static void main(String[] args) {
        //Create a simple number guessing game,
        int secretNumber = 56;
        System.out.println("Guess the secret number?");
        // that takes in some user input
        Scanner reader = new Scanner(System.in);
        String guess = reader.nextLine();
        // matches it to a 'secret' number.
        int guessedNumber = parseInt(guess.trim());
        if(secretNumber == guessedNumber) {
            System.out.println("Correct");
        }
        else if(guessedNumber < secretNumber) {
            System.out.println("Too low");
        }
        else {
            System.out.println("Too high");
        }

        //The program should indicate if an incorrect guess is too high or too low. It should, of course, let the user know if they have guessed the number correctly.

    }
}

//echo "# GuessingGame" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin git@github.com:samra-a/GuessingGame.git
//        git push -u origin main