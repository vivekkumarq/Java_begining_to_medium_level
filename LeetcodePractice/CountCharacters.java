package LeetcodePractice;

import java.util.Arrays;

public class CountCharacters {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }

        int total = 0;
        for (String word : words) {
            int[] temp = Arrays.copyOf(freq, 26);
            boolean good = true;
            for (char c : word.toCharArray()) {
                if (temp[c - 'a'] == 0) {
                    good = false;
                    break;
                }
                temp[c - 'a']--;
            }
            if (good) {
                total += word.length();
            }
        }
        return total;
    }

    public static void main(String[] args) {
        CountCharacters sol = new CountCharacters();
        String[] words1 = {"cat","bt","hat","tree"};
        String chars1 = "atach";
        System.out.println(sol.countCharacters(words1, chars1));

        String[] words2 = {"hello","world","leetcode"};
        String chars2 = "welldonehoneyr";
        System.out.println(sol.countCharacters(words2, chars2));
    }
}
