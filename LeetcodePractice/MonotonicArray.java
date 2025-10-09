package LeetcodePractice;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false; 
            }
            if (nums[i] < nums[i - 1]) {
                increasing = false; 
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        MonotonicArray sol = new MonotonicArray();
        System.out.println(sol.isMonotonic(new int[]{1, 2, 2, 3})); 
        System.out.println(sol.isMonotonic(new int[]{6, 5, 4, 4})); 
        System.out.println(sol.isMonotonic(new int[]{1, 3, 2}));    
    }
}
