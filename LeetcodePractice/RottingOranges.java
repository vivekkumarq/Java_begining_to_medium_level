package LeetcodePractice;

import java.util.*;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;

  
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    freshOranges++;
                }
            }
        }

        
        if (freshOranges == 0) return 0;

        int minutes = 0;
        int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rottedThisMinute = false;

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                for (int[] d : dirs) {
                    int r = curr[0] + d[0], c = curr[1] + d[1];
                    if (r >= 0 && r < rows && c >= 0 && c < cols && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        queue.offer(new int[]{r, c});
                        freshOranges--;
                        rottedThisMinute = true;
                    }
                }
            }

            if (rottedThisMinute) minutes++;
        }

        return freshOranges == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        RottingOranges solver = new RottingOranges();

        int[][] grid1 = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(solver.orangesRotting(grid1)); 

        int[][] grid2 = {{2,1,1},{0,1,1},{1,0,1}};
        System.out.println(solver.orangesRotting(grid2)); 

        int[][] grid3 = {{0,2}};
        System.out.println(solver.orangesRotting(grid3));
    }
}

