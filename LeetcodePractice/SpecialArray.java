package LeetcodePractice;

import java.util.Arrays;

public class SpecialArray {
      public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int x = n - i; 
            if (nums[i] >= x && (i == 0 || nums[i - 1] < x)) {
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 5};
        System.out.println(specialArray(nums1));

        int[] nums2 = {0, 0};
        System.out.println(specialArray(nums2)); 

        int[] nums3 = {0, 4, 3, 0, 4};
        System.out.println(specialArray(nums3)); 
    }
}
