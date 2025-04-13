package LeetcodePractice;

import java.util.HashMap;

public class MaxOperationsOnArray {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int operations = 0;

        for (int num : nums) {
            int complement = k - num;

            if (map.getOrDefault(complement, 0) > 0) {
                operations++;
                map.put(complement, map.get(complement) - 1); 
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1); 
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        MaxOperationsOnArray solver = new MaxOperationsOnArray();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solver.maxOperations(nums1, 5)); 

        int[] nums2 = {3, 1, 3, 4, 3};
        System.out.println(solver.maxOperations(nums2, 6)); 
    }
}
