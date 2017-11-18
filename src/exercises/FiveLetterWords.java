package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class FiveLetterWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String newWord;

        System.out.println("Enter a word (or ENTER to finish):");

        do {
            newWord = in.nextLine();

            if (!newWord.equals("")) {
                words.add(newWord);
            }

        } while(!newWord.equals(""));

        Five_Letter_Words(words);
    }
    public static void Five_Letter_Words(ArrayList<String> thewords) {
        for (String word : thewords){
            if (word.length()== 5){
               System.out.println(word);
            }

        }
    }
}
