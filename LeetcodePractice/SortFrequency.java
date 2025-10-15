package LeetcodePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortFrequency {
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA == freqB) {
                return b - a; 
            }
            return freqA - freqB;
        });

        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(frequencySort(nums1))); 

        int[] nums2 = {2, 3, 1, 3, 2};
        System.out.println(Arrays.toString(frequencySort(nums2))); 

        int[] nums3 = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        System.out.println(Arrays.toString(frequencySort(nums3))); 
    }
    
}
