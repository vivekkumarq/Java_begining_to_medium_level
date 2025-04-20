package LeetcodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDifference {
     public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);
        
        Set<Integer> onlyIn1 = new HashSet<>(set1);
        onlyIn1.removeAll(set2);
        
        Set<Integer> onlyIn2 = new HashSet<>(set2);
        onlyIn2.removeAll(set1);
        
        return Arrays.asList(new ArrayList<>(onlyIn1), new ArrayList<>(onlyIn2));
    }

    public static void main(String[] args) {
        ArrayDifference diff = new ArrayDifference();
        System.out.println(diff.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
        System.out.println(diff.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));
    }
}
