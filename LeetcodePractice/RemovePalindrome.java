package LeetcodePractice;

public class RemovePalindrome {
     public int removePalindromeSub(String s) {
        return isPalindrome(s) ? 1 : 2;
    }

    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        RemovePalindrome sol = new RemovePalindrome();
        System.out.println(sol.removePalindromeSub("ababa")); 
        System.out.println(sol.removePalindromeSub("abb"));   
        System.out.println(sol.removePalindromeSub("baabb")); 
    }
}
