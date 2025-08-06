package LeetcodePractice;

import java.util.*;

public class FairCandySwap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for (int a : aliceSizes) sumA += a;
        for (int b : bobSizes) sumB += b;

        int delta = (sumB - sumA) / 2;

        Set<Integer> bobSet = new HashSet<>();
        for (int b : bobSizes) {
            bobSet.add(b);
        }

        for (int a : aliceSizes) {
            int b = a + delta;
            if (bobSet.contains(b)) {
                return new int[]{a, b};
            }
        }

        return new int[0]; 
    }

    public static void main(String[] args) {
        int[] alice = {1, 2};
        int[] bob = {2, 3};
        int[] result = fairCandySwap(alice, bob);
        System.out.println(Arrays.toString(result)); 
    }
}

