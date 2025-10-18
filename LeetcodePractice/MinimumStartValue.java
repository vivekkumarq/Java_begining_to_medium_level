package LeetcodePractice;

public class MinimumStartValue {
    public static int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = 0;

        for (int num : nums) {
            sum += num;
            minSum = Math.min(minSum, sum);
        }

        return 1 - minSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-3, 2, -3, 4, 2};
        System.out.println(minStartValue(nums1)); 

        int[] nums2 = {1, 2};
        System.out.println(minStartValue(nums2)); 

        int[] nums3 = {1, -2, -3};
        System.out.println(minStartValue(nums3)); 
    }
}
