package LeetcodePractice;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s1 = "abab";
        System.out.println(repeatedSubstringPattern(s1));

        String s2 = "aba";
        System.out.println(repeatedSubstringPattern(s2)); 

        String s3 = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s3)); 

        String s4 = "a";
        System.out.println(repeatedSubstringPattern(s4)); 
    }

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int len = 1; len <= n / 2; len++) {
         
            if (n % len == 0) {
                String substring = s.substring(0, len);
                StringBuilder sb = new StringBuilder();

 
                for (int i = 0; i < n / len; i++) {
                    sb.append(substring);
                }

                
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}

