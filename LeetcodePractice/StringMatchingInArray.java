package LeetcodePractice;

import java.util.*;

public class StringMatchingInArray {
    public static void main(String[] args) {
        String[] words1 = {"mass","as","hero","superhero"};
        System.out.println(stringMatching(words1)); 

        String[] words2 = {"leetcode","et","code"};
        System.out.println(stringMatching(words2)); 

        String[] words3 = {"blue","green","bu"};
        System.out.println(stringMatching(words3)); 
    }

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word1 = words[i];
            for (int j = 0; j < words.length; j++) {
                if (i == j) continue;

                String word2 = words[j];
                if (word2.contains(word1)) {
                    result.add(word1);
                    break; 
                }
            }
        }

        return result;
    }
}

