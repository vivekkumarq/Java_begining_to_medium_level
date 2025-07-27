package LeetcodePractice;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums1)); 

        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(nums2));  
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }
}

