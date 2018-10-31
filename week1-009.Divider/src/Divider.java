
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the
        // input from user.

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        System.out.println("Type a another number: ");
        int anotherNumber = Integer.parseInt(reader.nextLine());

        double result = 1.0 * number / anotherNumber;

        System.out.println("Division: " + number + " / " + anotherNumber + " = " + result);
    }
}
