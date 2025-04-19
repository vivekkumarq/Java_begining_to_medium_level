package LeetcodePractice;

public class PivotIndexFinder {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        PivotIndexFinder finder = new PivotIndexFinder();
        
        System.out.println(finder.pivotIndex(new int[]{1,7,3,6,5,6})); 
        System.out.println(finder.pivotIndex(new int[]{1,2,3}));       
        System.out.println(finder.pivotIndex(new int[]{2,1,-1}));      
    }
}
