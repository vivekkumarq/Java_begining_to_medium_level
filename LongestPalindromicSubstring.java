public class LongestPalindromicSubstring {
    
    public static String longestPalindrome(String s) {
        int n = s.length();
        String longestString = "";
        
        for(int i = 0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                String sub = s.substring(i, j+1);
                
                if(isPalindrome(sub) && sub.length() > longestString.length()){
                    longestString = sub;
                }   
            }
        }
            return longestString;

        }

        private static boolean isPalindrome(String str){
            int left= 0;
            int right = str.length() - 1;
            while(left<right)
            {
                if(str.charAt(left) != str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

    public static void main(String[] args) {
        String s1 = "babad";
        System.out.println("Longest Palindrome Substring" + longestPalindrome(s1));
    }
}
