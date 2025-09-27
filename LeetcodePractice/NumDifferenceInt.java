package LeetcodePractice;

import java.util.HashSet;
import java.util.Set;

public class NumDifferenceInt {
   public int numDifferentIntegers(String word) {
        word = word.replaceAll("[a-z]", " ");
        String[] parts = word.trim().split("\\s+");
        Set<String> set = new HashSet<>();
        for (String p : parts) {
            if (!p.isEmpty()) {
                set.add(p.replaceFirst("^0+", ""));
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        NumDifferenceInt sol = new NumDifferenceInt();
        System.out.println(sol.numDifferentIntegers("a123bc34d8ef34")); 
        System.out.println(sol.numDifferentIntegers("leet1234code234")); 
        System.out.println(sol.numDifferentIntegers("a1b01c001")); 
    } 
}
