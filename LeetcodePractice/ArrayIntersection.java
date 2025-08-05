package LeetcodePractice;
import java.util.*;

public class ArrayIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        
        for (int num : nums1) {
            set1.add(num);
        }

        
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num); 
            }
        }

      
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] result = intersection(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(result));
    }
}

