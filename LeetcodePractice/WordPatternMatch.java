package LeetcodePractice;

import java.util.*;

public class WordPatternMatch {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) return false;

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word)) return false;
            } else {
                if (wordToChar.containsKey(word)) return false;
                charToWord.put(ch, word);
                wordToChar.put(word, ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPatternMatch obj = new WordPatternMatch();

        System.out.println(obj.wordPattern("abba", "dog cat cat dog")); 
        System.out.println(obj.wordPattern("abba", "dog cat cat fish")); 
        System.out.println(obj.wordPattern("aaaa", "dog cat cat dog"));  
    }
}

