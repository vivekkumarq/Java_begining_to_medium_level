package LeetcodePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallestNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sorted.length; i++) {
            map.putIfAbsent(sorted[i], i);
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums1))); // [4, 0, 1, 1, 3]

        int[] nums2 = {6, 5, 4, 8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums2))); // [2, 1, 0, 3]

        int[] nums3 = {7, 7, 7, 7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums3))); // [0, 0, 0, 0]
    }
    
}
