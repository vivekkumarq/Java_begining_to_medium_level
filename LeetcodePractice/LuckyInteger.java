package LeetcodePractice;
import java.util.*;

public class LuckyInteger {
    public static int findLucky(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int result = -1;

        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            if (num == freq) {
                result = Math.max(result, num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 4};
        int[] arr2 = {1, 2, 2, 3, 3, 3};
        int[] arr3 = {2, 2, 2, 3, 3};

        System.out.println(findLucky(arr1)); 
        System.out.println(findLucky(arr2)); 
        System.out.println(findLucky(arr3)); 
    }
}

