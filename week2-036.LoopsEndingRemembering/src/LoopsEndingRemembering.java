import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        int number = 0;
        int sum = 0;
        int i = 0;
        double average = 0;
        int o = 0;
        int e = 0;

        while (number != -1) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + i);
                System.out.println("Average" +  (1.0 * sum / i));
                System.out.println("Even numbers: " + e);
                System.out.println("Odd numbers: " + o);

                break;
            }   else {
                sum += number;
                i++;

                if (number % 2 == 0) {
                    e++;
                } else {
                    o++;
                }

            }
        }
    }
}
