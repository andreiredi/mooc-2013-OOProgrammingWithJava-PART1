
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]" );
        int number = Integer.parseInt(reader.nextLine());

        if (number <= 29) {
            System.out.println("Grade: failed");
        } else if ( number >= 30 && number < 35) {
            System.out.println("Grade: 1");
        } else if (number >= 35 && number < 40 ) {
            System.out.println("Grade: 2");
        } else if (number >= 40 && number < 45) {
            System.out.println("Grade: 3");
        } else if (number >= 45  && number < 50) {
            System.out.println("Grade: 4");
        } else if (number >= 50 && number < 60 ) {
            System.out.println("Grade: 5");
        }



    }
}
