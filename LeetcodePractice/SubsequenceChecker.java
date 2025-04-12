package LeetcodePractice;

public class SubsequenceChecker {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; 
            }
            j++; 
        }

        return i == s.length();
    }

    public static void main(String[] args) {
    
        System.out.println(isSubsequence("abc", "ahbgdc")); 
        System.out.println(isSubsequence("axc", "ahbgdc")); 
    }
}
