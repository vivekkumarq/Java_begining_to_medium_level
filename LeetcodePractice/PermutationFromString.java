package LeetcodePractice;

import java.util.*;

public class PermutationFromString {
    public static int[] diStringMatch(String s) {
        int n = s.length();
        int[] res = new int[n + 1];
        int low = 0, high = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') res[i] = low++;
            else res[i] = high--;
        }
        res[n] = low;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
        System.out.println(Arrays.toString(diStringMatch("III")));
        System.out.println(Arrays.toString(diStringMatch("DDI")));
    }
}

