package LeetcodePractice;

import java.util.*;

public class OddStringDifference {
    public static String oddString(String[] words) {
        int n = words[0].length();
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            int[] diff = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                diff[i] = (words[0].charAt(i) - 'a') - (words[0].charAt(0) - 'a'); 
            }
            for (int i = 0; i < n - 1; i++) {
                diff[i] = word.charAt(i + 1) - word.charAt(i);
            }
            String key = Arrays.toString(diff);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        for (List<String> group : map.values()) {
            if (group.size() == 1) return group.get(0);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(oddString(new String[]{"adc","wzy","abc"})); 
        System.out.println(oddString(new String[]{"aaa","bob","ccc","ddd"})); 
    }
}

