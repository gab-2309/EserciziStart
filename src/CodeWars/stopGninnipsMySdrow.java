package CodeWars;

import java.util.Arrays;

public class stopGninnipsMySdrow {
    public static void main(String[] args) {

// Write a function that takes in a string of one or more words, and returns the same string,
// but with all words that have five or more letters reversed (Just like the name of this Kata).
// Strings passed in will consist of only letters and spaces.
// Spaces will be included only when more than one word is present.

        String frase = "Hey fellow warriors";
        System.out.println(spinWords(frase) + ")");
    }

    public static String spinWords(String sentence) {

        String[] parole = sentence.split(" ");
        StringBuilder stringaFinale = new StringBuilder();
        for (int i = 0; i < parole.length; i++) {
            if (parole[i].length() >= 5) {
                StringBuilder sb = new StringBuilder(parole[i]);
                stringaFinale.append(sb.reverse().append(" "));
                continue;
            }
            stringaFinale.append(parole[i]).append(" ");

        }
        return stringaFinale.toString().trim();
    }
}
