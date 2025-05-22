package LeetcodePractice;
import java.util.*;

public class MaxScoreSubsequence {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums2[i]; 
            pairs[i][1] = nums1[i]; 
        }

      
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long sum = 0, maxScore = 0;

        for (int[] pair : pairs) {
            int curNum2 = pair[0];
            int curNum1 = pair[1];

            minHeap.offer(curNum1);
            sum += curNum1;

            if (minHeap.size() > k) {
                sum -= minHeap.poll();
            }

            if (minHeap.size() == k) {
                maxScore = Math.max(maxScore, sum * curNum2);
            }
        }

        return maxScore;
    }

    public static void main(String[] args) {
        MaxScoreSubsequence solver = new MaxScoreSubsequence();

        int[] nums1_1 = {1, 3, 3, 2};
        int[] nums2_1 = {2, 1, 3, 4};
        int k1 = 3;
        System.out.println(solver.maxScore(nums1_1, nums2_1, k1)); 

        int[] nums1_2 = {4, 2, 3, 1, 1};
        int[] nums2_2 = {7, 5, 10, 9, 6};
        int k2 = 1;
        System.out.println(solver.maxScore(nums1_2, nums2_2, k2));
    }
}

