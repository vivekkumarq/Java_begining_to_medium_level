package LeetcodePractice;

import java.util.Arrays;

public class CloseStringsChecker {
     public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char ch : word1.toCharArray()) {
            count1[ch - 'a']++;
        }

        for (char ch : word2.toCharArray()) {
            count2[ch - 'a']++;
        }

        
        for (int i = 0; i < 26; i++) {
            if ((count1[i] == 0 && count2[i] != 0) || (count1[i] != 0 && count2[i] == 0)) {
                return false;
            }
        }

       
        Arrays.sort(count1);
        Arrays.sort(count2);

        return Arrays.equals(count1, count2);
    }

    public static void main(String[] args) {
        CloseStringsChecker checker = new CloseStringsChecker();

        System.out.println(checker.closeStrings("abc", "bca"));       
        System.out.println(checker.closeStrings("a", "aa"));        
        System.out.println(checker.closeStrings("cabbba", "abbccc"));
    }
    
}
