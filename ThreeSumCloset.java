import java.util.Arrays;

public class ThreeSumCloset {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); 
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;  
                } else if (sum > target) {
                    right--;
                } else {
                    return sum; 
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {

        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("Closest Sum: " + threeSumClosest(nums1, target1));

        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println("Closest Sum: " + threeSumClosest(nums2, target2));
    }
}
