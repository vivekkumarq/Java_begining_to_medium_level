package LeetcodePractice;

public class CheckOnesSegment {
    public boolean checkOnesSegment(String s) {
        int blocks = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' && (i == 0 || s.charAt(i - 1) == '0')) {
                blocks++;
                if (blocks > 1) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckOnesSegment sol = new CheckOnesSegment();
        System.out.println(sol.checkOnesSegment("1001"));
        System.out.println(sol.checkOnesSegment("110"));
    }
}

