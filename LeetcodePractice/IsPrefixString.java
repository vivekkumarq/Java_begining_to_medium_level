package LeetcodePractice;

public class IsPrefixString {
     public boolean isPrefixString(String s, String[] words) {
        StringBuilder prefix = new StringBuilder();
        for (String word : words) {
            prefix.append(word);
            if (prefix.toString().equals(s)) return true;
            if (prefix.length() > s.length()) return false;
        }
        return false;
    }

    public static void main(String[] args) {
        IsPrefixString sol = new IsPrefixString();
        System.out.println(sol.isPrefixString("iloveleetcode", new String[]{"i","love","leetcode","apples"})); 
        System.out.println(sol.isPrefixString("iloveleetcode", new String[]{"apples","i","love","leetcode"})); 
    }
}
