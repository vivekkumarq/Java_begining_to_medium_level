package LeetcodePractice;

import java.util.HashMap;
import java.util.Map;

public class EqualRowColumnPairs {
     public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();

       
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(",");
            }
            String rowStr = sb.toString();
            rowMap.put(rowStr, rowMap.getOrDefault(rowStr, 0) + 1);
        }

        int count = 0;

        
        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append(",");
            }
            String colStr = sb.toString();
            count += rowMap.getOrDefault(colStr, 0);
        }

        return count;
    }

    public static void main(String[] args) {
        EqualRowColumnPairs solution = new EqualRowColumnPairs();

        int[][] grid1 = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(solution.equalPairs(grid1));  

        int[][] grid2 = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(solution.equalPairs(grid2));  
    }
}
