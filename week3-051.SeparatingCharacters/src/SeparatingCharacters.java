
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int i = name.length();
        int ii = 0;
        while (i > 0) {

            System.out.println((ii + 1) + ". character: " + name.charAt(ii));
            i--;
            ii++;
        }
    }
}
