package LeetcodePractice;

import java.util.Arrays;
import java.util.List;

public class VisitAllRooms {
     public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(0, rooms, visited);

       
        for (boolean v : visited) {
            if (!v) return false;
        }
        return true;
    }

    private void dfs(int room, List<List<Integer>> rooms, boolean[] visited) {
        if (visited[room]) return;
        visited[room] = true;

        for (int key : rooms.get(room)) {
            dfs(key, rooms, visited);
        }
    }

    public static void main(String[] args) {
        VisitAllRooms solution = new VisitAllRooms();

        List<List<Integer>> rooms1 = Arrays.asList(
            Arrays.asList(1),
            Arrays.asList(2),
            Arrays.asList(3),
            Arrays.asList()
        );

        List<List<Integer>> rooms2 = Arrays.asList(
            Arrays.asList(1, 3),
            Arrays.asList(3, 0, 1),
            Arrays.asList(2),
            Arrays.asList(0)
        );

        System.out.println("Can visit all rooms (Example 1)? " + solution.canVisitAllRooms(rooms1)); // true
        System.out.println("Can visit all rooms (Example 2)? " + solution.canVisitAllRooms(rooms2)); // false
    }
    
}
