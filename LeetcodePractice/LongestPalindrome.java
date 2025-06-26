package LeetcodePractice;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        Map<Character, Integer> charCount = new HashMap<>();


        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOddCount = false;

        for (int count : charCount.values()) {
        
            length += (count / 2) * 2;


            if (count % 2 == 1) {
                hasOddCount = true;
            }
        }


        if (hasOddCount) {
            length += 1;
        }

        return length;
    }

    public static void main(String[] args) {
        String s1 = "abccccdd";
        String s2 = "a";

        System.out.println("Input: " + s1 + " -> Output: " + longestPalindrome(s1)); 
        System.out.println("Input: " + s2 + " -> Output: " + longestPalindrome(s2)); 
    }
}

