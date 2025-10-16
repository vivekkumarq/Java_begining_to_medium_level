package LeetcodePractice;

import java.util.Arrays;

public class RelativeRanks {
     public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];


        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }

        
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            if (i == 0)
                result[arr[i][1]] = "Gold Medal";
            else if (i == 1)
                result[arr[i][1]] = "Silver Medal";
            else if (i == 2)
                result[arr[i][1]] = "Bronze Medal";
            else
                result[arr[i][1]] = String.valueOf(i + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] score1 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findRelativeRanks(score1)));
        

        int[] score2 = {10, 3, 8, 9, 4};
        System.out.println(Arrays.toString(findRelativeRanks(score2)));

    }
}
