package LeetcodePractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        
        Set<Integer> occurrenceSet = new HashSet<>();
        for (int count : countMap.values()) {
           
            if (!occurrenceSet.add(count)) {
                return false;
            }
        }
        
        return true;
    }

   
    public static void main(String[] args) {
        UniqueOccurrences solution = new UniqueOccurrences();
        System.out.println(solution.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        System.out.println(solution.uniqueOccurrences(new int[]{1,2}));        
        System.out.println(solution.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}
