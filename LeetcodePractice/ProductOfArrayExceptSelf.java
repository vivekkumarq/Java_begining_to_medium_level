package LeetcodePractice;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] answer = new int[n];

       
        answer[0] = 1;  
        for (int i = 1; i < n; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        
        int[] result1 = obj.productExceptSelf(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(result1));

        int[] result2 = obj.productExceptSelf(new int[]{-1,1,0,-3,3});
        System.out.println(Arrays.toString(result2));
    }
    
}
