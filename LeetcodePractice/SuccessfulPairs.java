package LeetcodePractice;
import java.util.*;

public class SuccessfulPairs {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length, m = potions.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int left = 0, right = m - 1;
            int idx = m;

            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spell * potions[mid] >= success) {
                    idx = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            result[i] = m - idx;
        }

        return result;
    }

    public static void main(String[] args) {
        SuccessfulPairs solver = new SuccessfulPairs();

        int[] spells1 = {5, 1, 3}, potions1 = {1, 2, 3, 4, 5};
        long success1 = 7;
        System.out.println(Arrays.toString(solver.successfulPairs(spells1, potions1, success1))); // [4, 0, 3]

        int[] spells2 = {3, 1, 2}, potions2 = {8, 5, 8};
        long success2 = 16;
        System.out.println(Arrays.toString(solver.successfulPairs(spells2, potions2, success2))); // [2, 0, 2]
    }
}

