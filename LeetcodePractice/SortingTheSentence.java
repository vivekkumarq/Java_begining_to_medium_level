package LeetcodePractice;

import java.util.*;

public class SortingTheSentence {
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for (String word : words) {
            int pos = word.charAt(word.length() - 1) - '0';
            sorted[pos - 1] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", sorted);
    }

    public static void main(String[] args) {
        String s1 = "is2 sentence4 This1 a3";
        String s2 = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s1)); 
        System.out.println(sortSentence(s2)); 
    }
}

