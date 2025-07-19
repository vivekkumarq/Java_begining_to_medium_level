package LeetcodePractice;

import java.util.Arrays;

public class ShortestDistanceToChar {
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];
        int prev = -n; 


        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            answer[i] = i - prev;
        }

        prev = 2 * n;

     
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            answer[i] = Math.min(answer[i], prev - i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String s1 = "loveleetcode";
        char c1 = 'e';
        System.out.println(Arrays.toString(shortestToChar(s1, c1)));
        

        String s2 = "aaab";
        char c2 = 'b';
        System.out.println(Arrays.toString(shortestToChar(s2, c2)));
       
    }
}

