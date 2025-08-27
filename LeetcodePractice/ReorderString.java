package LeetcodePractice;

public class ReorderString {
    public static String sortString(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        int remaining = s.length();

        while (remaining > 0) {
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    result.append((char) (i + 'a'));
                    freq[i]--;
                    remaining--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    result.append((char) (i + 'a'));
                    freq[i]--;
                    remaining--;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "aaaabbbbcccc";
        String s2 = "rat";
        String s3 = "leetcode";

        System.out.println(sortString(s1)); 
        System.out.println(sortString(s2));
        System.out.println(sortString(s3));
    }
}

