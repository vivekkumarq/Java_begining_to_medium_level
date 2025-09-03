package LeetcodePractice;

public class KBeautyOfNumber {
    public static int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            int val = Integer.parseInt(s.substring(i, i + k));
            if (val != 0 && num % val == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(divisorSubstrings(240, 2));
        System.out.println(divisorSubstrings(430043, 2));
    }
}

