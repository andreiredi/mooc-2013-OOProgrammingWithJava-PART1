
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;

        System.out.println("Until what?");
        int until = Integer.parseInt(reader.nextLine());
        int i = 0;
        while(i <= until) {
            sum += i;
            i++;

        }
        System.out.println("Sum is " + sum);
    }
}
