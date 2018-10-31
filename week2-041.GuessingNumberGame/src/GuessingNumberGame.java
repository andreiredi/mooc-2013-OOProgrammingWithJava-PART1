
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!

        int numberGuess = 0;
        int i = 0;
        while (numberDrawn < 100) {
            System.out.println("Guess the number");
            i++;
            numberGuess = Integer.parseInt(reader.nextLine());

            if (numberGuess < numberDrawn) {

                System.out.println("The number is greater:"+ " guesses made: " + i);
            } else if (numberGuess > numberDrawn) {
                System.out.println("The number is lesser:"+ " guesses made: " + i);
            } else if (numberDrawn == numberGuess) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
