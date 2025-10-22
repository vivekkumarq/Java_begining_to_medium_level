package LeetcodePractice;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
     public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 2};
        System.out.println(sumOfUnique(nums1));

        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println(sumOfUnique(nums2)); 

        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println(sumOfUnique(nums3)); 
    }
}
