package LeetcodePractice;
import java.util.*;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums1 = {1,4,3,2};
        System.out.println(arrayPairSum(nums1));

        int[] nums2 = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums2)); 
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}

