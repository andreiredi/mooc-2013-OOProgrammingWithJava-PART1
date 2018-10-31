import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

       ArrayList<String> words = new ArrayList<String>();

        String word="hello";

        while (!word.isEmpty()) {
            System.out.println("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }

        Collections.reverse(words);

        System.out.println("You typed the following word: ");


        for(String test : words) {
            System.out.println(test);
        }
    }
}
