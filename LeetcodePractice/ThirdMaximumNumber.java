package LeetcodePractice;

import java.util.*;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); // descending order

        for (int num : nums) {
            set.add(num);
        }

        
        if (set.size() < 3) {
            return set.first();
        }

        
        set.pollFirst(); 
        set.pollFirst(); 
        return set.first(); 
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{3, 2, 1}));    
        System.out.println(thirdMax(new int[]{1, 2}));       
        System.out.println(thirdMax(new int[]{2, 2, 3, 1})); 
    }
}

