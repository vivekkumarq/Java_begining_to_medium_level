package LeetcodePractice;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // Else take the max from left or top cell
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The answer is in the bottom-right cell
        return dp[m][n];
    }

    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();

        System.out.println(lcs.longestCommonSubsequence("abcde", "ace"));   // Output: 3
        System.out.println(lcs.longestCommonSubsequence("abc", "abc"));     // Output: 3
        System.out.println(lcs.longestCommonSubsequence("abc", "def"));     // Output: 0
    }
}

