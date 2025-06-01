package LeetcodePractice;

public class HouseRobber {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int prev1 = nums[0];            
        int prev2 = Math.max(nums[0], nums[1]); 

        for (int i = 2; i < n; i++) {
            int curr = Math.max(prev2, prev1 + nums[i]);
            prev1 = prev2;
            prev2 = curr;
        }

        return prev2;
    }

    public static void main(String[] args) {
        HouseRobber solver = new HouseRobber();

        System.out.println(solver.rob(new int[]{1, 2, 3, 1}));    
        System.out.println(solver.rob(new int[]{2, 7, 9, 3, 1}));  
    }
}

