package LeetcodePractice;

import java.util.*;

public class OccurrencesAfterBigram {
    public static String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                result.add(words[i + 2]);
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            findOcurrences("alice is a good girl she is a good student", "a", "good")
        )); 

        System.out.println(Arrays.toString(
            findOcurrences("we will we will rock you", "we", "will")
        ));
    }
}

