package LeetcodePractice;

public class CheckOnesSegment {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01") || s.lastIndexOf("01") == s.indexOf("01");
    }

    public static void main(String[] args) {
        CheckOnesSegment sol = new CheckOnesSegment();
        System.out.println(sol.checkOnesSegment("1001"));
        System.out.println(sol.checkOnesSegment("110"));
    }
}

