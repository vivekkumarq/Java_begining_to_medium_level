package LeetcodePractice;

import java.util.*;

public class NearestExitInMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;

    
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+'; 

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int row = cur[0], col = cur[1], steps = cur[2];

            for (int[] d : dirs) {
                int r = row + d[0];
                int c = col + d[1];

                if (r >= 0 && r < m && c >= 0 && c < n && maze[r][c] == '.') {
 
                    if (r == 0 || r == m - 1 || c == 0 || c == n - 1) {
                        return steps + 1;
                    }

                    maze[r][c] = '+';
                    queue.offer(new int[]{r, c, steps + 1});
                }
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        NearestExitInMaze solver = new NearestExitInMaze();

        char[][] maze1 = {
            {'+', '+', '.', '+'},
            {'.', '.', '.', '+'},
            {'+', '+', '+', '.'}
        };
        int[] entrance1 = {1, 2};
        System.out.println(solver.nearestExit(maze1, entrance1)); 

        char[][] maze2 = {
            {'+', '+', '+'},
            {'.', '.', '.'},
            {'+', '+', '+'}
        };
        int[] entrance2 = {1, 0};
        System.out.println(solver.nearestExit(maze2, entrance2)); 

        char[][] maze3 = {
            {'.', '+'}
        };
        int[] entrance3 = {0, 0};
        System.out.println(solver.nearestExit(maze3, entrance3)); 
    }
}

