package LeetcodePractice;

import java.util.ArrayList;
import java.util.List;

public class LargeGroupPositions {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int n = s.length();
        int start = 0;
        for (int i = 1; i <= n; i++) {
            if (i == n || s.charAt(i) != s.charAt(start)) {
                if (i - start >= 3) {
                    List<Integer> interval = new ArrayList<>();
                    interval.add(start);
                    interval.add(i - 1);
                    result.add(interval);
                }
                start = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LargeGroupPositions sol = new LargeGroupPositions();
        System.out.println(sol.largeGroupPositions("abbxxxxzzy")); 
        System.out.println(sol.largeGroupPositions("abc")); 
        System.out.println(sol.largeGroupPositions("abcdddeeeeaabbbcd")); 
    }
}

