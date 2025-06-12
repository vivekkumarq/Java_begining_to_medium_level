package LeetcodePractice;

import java.util.Arrays;

public class NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
         
            if (intervals[i][0] < prevEnd) {
                count++;
            } else {
              
                prevEnd = intervals[i][1];
            }
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        NonOverlappingIntervals solver = new NonOverlappingIntervals();

        int[][] input1 = {{1,2},{2,3},{3,4},{1,3}};
        int[][] input2 = {{1,2},{1,2},{1,2}};
        int[][] input3 = {{1,2},{2,3}};

        System.out.println("Output 1: " + solver.eraseOverlapIntervals(input1)); 
        System.out.println("Output 2: " + solver.eraseOverlapIntervals(input2)); 
        System.out.println("Output 3: " + solver.eraseOverlapIntervals(input3)); 
    }
}

