package LeetcodePractice;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
        }
        return Math.min(set.size(), candyType.length / 2);
    }

    public static void main(String[] args) {
        DistributeCandies sol = new DistributeCandies();
        System.out.println(sol.distributeCandies(new int[]{1,1,2,2,3,3})); 
        System.out.println(sol.distributeCandies(new int[]{1,1,2,3}));     
        System.out.println(sol.distributeCandies(new int[]{6,6,6,6}));    
    }
}
