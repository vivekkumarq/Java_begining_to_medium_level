package LeetcodePractice;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
           
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1)); 

        String s2 = "race a car";
        System.out.println(isPalindrome(s2)); 

        String s3 = " ";
        System.out.println(isPalindrome(s3)); 
    }
    
}
