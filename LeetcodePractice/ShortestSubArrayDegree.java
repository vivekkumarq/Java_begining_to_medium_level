package LeetcodePractice;

import java.util.Map;
import java.util.HashMap;

public class ShortestSubArrayDegree {
     public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        int degree = 0, minLen = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            first.putIfAbsent(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if (count.get(nums[i]) > degree) degree = count.get(nums[i]);
        }
        for (int num : count.keySet()) {
            if (count.get(num) == degree) {
                int lastIndex = 0;
                for (int i = nums.length - 1; i >= 0; i--) {
                    if (nums[i] == num) {
                        lastIndex = i;
                        break;
                    }
                }
                minLen = Math.min(minLen, lastIndex - first.get(num) + 1);
            }
        }
        return minLen;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums1));
        int[] nums2 = {1, 2, 2, 3, 1, 4, 2};
        System.out.println(findShortestSubArray(nums2));
    }
}
