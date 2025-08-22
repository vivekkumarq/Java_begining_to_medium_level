package LeetcodePractice;

import java.util.HashMap;

public class GoodStringCheck {
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int count = freq.values().iterator().next();
        for (int val : freq.values()) {
            if (val != count) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abacbc"));
        System.out.println(areOccurrencesEqual("aaabb"));
    }
}

