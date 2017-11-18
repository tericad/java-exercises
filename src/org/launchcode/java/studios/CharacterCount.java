package org.launchcode.java.studios;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        String sample = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = sample.toCharArray();

        for (char i : charactersInString){
            if (charCount.containsKey(i)){
                int value = charCount.get(i);
                value = value + 1;
                charCount.replace(i,value);
            }
            else {charCount.put(i, 1);
            }
        }



        for (Map.Entry<Character, Integer> finalcharCount : charCount.entrySet()) {
            System.out.println(finalcharCount.getKey() + ": " + finalcharCount.getValue());
        }

    }
}
