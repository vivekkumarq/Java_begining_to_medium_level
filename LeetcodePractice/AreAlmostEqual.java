package LeetcodePractice;

public class AreAlmostEqual {
     public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        int n = s1.length();
        int first = -1, second = -1, diff = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
                if (first == -1) first = i;
                else if (second == -1) second = i;
                else return false;
            }
        }
        return diff == 2 && s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first);
    }

    public static void main(String[] args) {
        AreAlmostEqual sol = new AreAlmostEqual();
        System.out.println(sol.areAlmostEqual("bank", "kanb")); 
        System.out.println(sol.areAlmostEqual("attack", "defend")); 
        System.out.println(sol.areAlmostEqual("kelb", "kelb")); 
    }
}
