
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());

        System.out.println("Second: ");
        int second = Integer.parseInt(reader.nextLine());
        int result = 0;
        while(first <= second) {
            result += first;
            first++;
        }
        System.out.println("The sum is " + result);

    }
}
