package LeetcodePractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
     public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();
        int duplicate = -1;

        for (int num : nums) {
            if (seen.contains(num)) {
                duplicate = num;  
            }
            seen.add(num);
        }

    
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;

        int missing = expectedSum - (actualSum - duplicate);
        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        SetMismatch sol = new SetMismatch();
        System.out.println(Arrays.toString(sol.findErrorNums(new int[]{1,2,2,4}))); 
        System.out.println(Arrays.toString(sol.findErrorNums(new int[]{1,1})));     
    }
}
