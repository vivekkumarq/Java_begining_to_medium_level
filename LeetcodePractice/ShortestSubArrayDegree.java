package LeetcodePractice;

import java.util.Map;
import java.util.HashMap;

// O(n) time, O(n) space. one pass records first index, last index and count for each value
public class ShortestSubArrayDegree {
     public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();
        int degree = 0, minLen = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            first.putIfAbsent(nums[i], i);
            last.put(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if (count.get(nums[i]) > degree) degree = count.get(nums[i]);
        }
        for (int num : count.keySet()) {
            if (count.get(num) == degree) {
                minLen = Math.min(minLen, last.get(num) - first.get(num) + 1);
            }
        }
        return minLen;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums1));
        int[] nums2 = {1, 2, 2, 3, 1, 4, 2};
        System.out.println(findShortestSubArray(nums2));
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println(findShortestSubArray(nums3));
    }
}
