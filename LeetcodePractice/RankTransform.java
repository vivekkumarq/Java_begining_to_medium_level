package LeetcodePractice;

import java.util.Arrays;
import java.util.Map;

public class RankTransform {
     public static int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> rank = new HashMap<>();
        int r = 1;
        for (int num : sorted) {
            if (!rank.containsKey(num)) rank.put(num, r++);
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = rank.get(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr1)));
        int[] arr2 = {100,100,100};
        System.out.println(Arrays.toString(arrayRankTransform(arr2)));
        int[] arr3 = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr3)));
    }
    
}
