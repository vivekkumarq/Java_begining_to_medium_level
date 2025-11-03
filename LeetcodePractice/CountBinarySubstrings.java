package LeetcodePractice;

public class CountBinarySubstrings {
    public static int countBinarySubstrings(String s) {
        int prev = 0, curr = 1, res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) curr++;
            else {
                res += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }
        return res + Math.min(prev, curr);
    }

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
        System.out.println(countBinarySubstrings("10101"));
    }
}
