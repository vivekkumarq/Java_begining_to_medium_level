package LeetcodePractice;

public class ConsecutiveChar {
     public int maxPower(String s) {
        int maxLen = 1, currLen = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        ConsecutiveChar sol = new ConsecutiveChar();
        System.out.println(sol.maxPower("leetcode"));         
        System.out.println(sol.maxPower("abbcccddddeeeeedcba")); 
    } 
}
