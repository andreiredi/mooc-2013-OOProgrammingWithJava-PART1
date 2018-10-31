
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here

        System.out.println("Type a number: ");
        double number = Math.abs(Integer.parseInt(reader.nextLine()));

        double result = number % 2;

        if (result == 1) {
            System.out.println("Number " + number + " is odd" );
        } else {
            System.out.println("Number " + number + " is even" );
        }


    }
}
