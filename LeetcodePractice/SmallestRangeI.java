package LeetcodePractice;

public class SmallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        int diff = max - min;
        return Math.max(0, diff - 2 * k);
    }

    public static void main(String[] args) {
        SmallestRangeI sol = new SmallestRangeI();
        System.out.println(sol.smallestRangeI(new int[]{1}, 0));      
        System.out.println(sol.smallestRangeI(new int[]{0,10}, 2));    
        System.out.println(sol.smallestRangeI(new int[]{1,3,6}, 3));  
    }
}
