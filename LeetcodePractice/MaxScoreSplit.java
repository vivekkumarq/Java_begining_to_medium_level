package LeetcodePractice;

public class MaxScoreSplit {
    public static int maxScore(String s) {
        int totalOnes = 0, zeros = 0, ones = 0, maxScore = 0;
        for (char c : s.toCharArray()) if (c == '1') totalOnes++;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') zeros++;
            else ones++;
            maxScore = Math.max(maxScore, zeros + (totalOnes - ones));
        }
        return maxScore;
    }

    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
        System.out.println(maxScore("00111"));
        System.out.println(maxScore("1111"));
    }
}

