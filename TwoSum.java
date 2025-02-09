import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums,int target)
    {
              for(int i =0;i<nums.length - 1;i++)
        {
            for(int j= i+1;j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum twosum = new TwoSum();
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        System.out.println("Test1" + Arrays.toString(twosum.twoSum(nums1, target1))); 
    }   
}

