package LeetcodePractice;

public class HasValidSubstring {

    public boolean hasValidSubstring(String s, int k) {
        int n = s.length();
        for (int i = 0; i <= n - k; i++) {
            String sub = s.substring(i, i + k);
            char ch = sub.charAt(0);

          
            boolean allSame = true;
            for (int j = 1; j < k; j++) {
                if (sub.charAt(j) != ch) {
                    allSame = false;
                    break;
                }
            }
            if (!allSame) continue;

            
            if (i > 0 && s.charAt(i - 1) == ch) continue;

            
            if (i + k < n && s.charAt(i + k) == ch) continue;

            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        HasValidSubstring sol = new HasValidSubstring();

        String s1 = "aaabaaa";
        int k1 = 3;
        System.out.println("Input: " + s1 + ", k=" + k1 + " → Output: " + sol.hasValidSubstring(s1, k1)); 

        String s2 = "abc";
        int k2 = 2;
        System.out.println("Input: " + s2 + ", k=" + k2 + " → Output: " + sol.hasValidSubstring(s2, k2)); 

        String s3 = "baaaac";
        int k3 = 4;
        System.out.println("Input: " + s3 + ", k=" + k3 + " → Output: " + sol.hasValidSubstring(s3, k3)); 
    }
    
}
