package LeetcodePractice;

public class ValidPalindromeII {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));  
        System.out.println(validPalindrome("abca")); 
        System.out.println(validPalindrome("abc"));  
        System.out.println(validPalindrome("deeee")); 
    }

    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
               
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }

        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
