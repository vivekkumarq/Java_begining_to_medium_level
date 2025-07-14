package LeetcodePractice;

public class ShuffleString {
    public static void main(String[] args) {
        String s1 = "codeleet";
        int[] indices1 = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s1, indices1));

        String s2 = "abc";
        int[] indices2 = {0,1,2};
        System.out.println(restoreString(s2, indices2)); 
    }

    public static String restoreString(String s, int[] indices) {
        char[] shuffled = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = s.charAt(i);
        }

        return new String(shuffled);
    }
}

