package LeetcodePractice;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// O(n) time, O(n) space. one pass, keep every number seen in a map and look for target - num
public class TwoSum {
    public int[] twoSum(int[] nums,int target)
    {
        Map<Integer,Integer> seen = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            Integer j = seen.get(target - nums[i]);
            if(j != null)
            {
                return new int[] {j,i};
            }
            seen.put(nums[i],i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum twosum = new TwoSum();
        int[] nums1 = {2,7,11,15};
        System.out.println("Test1" + Arrays.toString(twosum.twoSum(nums1, 9)));

        int[] nums2 = {3,2,4};
        System.out.println("Test2" + Arrays.toString(twosum.twoSum(nums2, 6)));

        int[] nums3 = {3,3};
        System.out.println("Test3" + Arrays.toString(twosum.twoSum(nums3, 6)));
    }
}
