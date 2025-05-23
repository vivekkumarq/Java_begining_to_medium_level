package LeetcodePractice;

import java.util.*;

public class HiringWorkers {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        long total = 0;
        int i = 0, j = n - 1;

        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();

        
        for (int l = 0; l < candidates && i <= j; l++) {
            left.offer(costs[i++]);
        }

        for (int r = 0; r < candidates && i <= j; r++) {
            right.offer(costs[j--]);
        }

        
        for (int hireCount = 0; hireCount < k; hireCount++) {
            if (right.isEmpty() || (!left.isEmpty() && left.peek() <= right.peek())) {
                total += left.poll();
                if (i <= j) {
                    left.offer(costs[i++]);
                }
            } else {
                total += right.poll();
                if (i <= j) {
                    right.offer(costs[j--]);
                }
            }
        }

        return total;
    }

    public static void main(String[] args) {
        HiringWorkers hw = new HiringWorkers();

        int[] costs1 = {17, 12, 10, 2, 7, 2, 11, 20, 8};
        System.out.println(hw.totalCost(costs1, 3, 4)); 

        int[] costs2 = {1, 2, 4, 1};
        System.out.println(hw.totalCost(costs2, 3, 3)); 
    }
}

