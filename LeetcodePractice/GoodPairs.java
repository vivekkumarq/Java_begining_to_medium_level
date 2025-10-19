package LeetcodePractice;

import java.util.HashMap;

public class GoodPairs {
     public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums) {
            
            goodPairs += countMap.getOrDefault(num, 0);
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return goodPairs;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums1)); 

        int[] nums2 = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums2)); 

        int[] nums3 = {1, 2, 3};
        System.out.println(numIdenticalPairs(nums3)); 
    }
}
