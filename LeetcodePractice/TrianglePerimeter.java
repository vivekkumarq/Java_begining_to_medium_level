package LeetcodePractice;
import java.util.Arrays;

public class TrianglePerimeter {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums); 
        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i - 2];
            int b = nums[i - 1];
            int c = nums[i];
            if (a + b > c) {
                return a + b + c;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{2, 1, 2}));    
        System.out.println(largestPerimeter(new int[]{1, 2, 1, 10})); 
    }
}

