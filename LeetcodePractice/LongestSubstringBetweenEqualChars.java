package LeetcodePractice;

import java.util.HashMap;

public class LongestSubstringBetweenEqualChars {
    public static int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> firstIndex = new HashMap<>();
        int maxLen = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (firstIndex.containsKey(c)) {
                maxLen = Math.max(maxLen, i - firstIndex.get(c) - 1);
            } else {
                firstIndex.put(c, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("aa"));
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
        System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));
    }
}