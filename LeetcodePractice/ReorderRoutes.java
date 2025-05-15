package LeetcodePractice;
import java.util.*;
public class ReorderRoutes {

    public int minReorder(int n, int[][] connections) {
        
        Map<Integer, List<int[]>> graph = new HashMap<>();
        
        for (int[] conn : connections) {
            int u = conn[0], v = conn[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, 1}); // original direction
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, 0}); // reverse direction
        }

      
        boolean[] visited = new boolean[n];
        return dfs(0, graph, visited);
    }

    private int dfs(int node, Map<Integer, List<int[]>> graph, boolean[] visited) {
        visited[node] = true;
        int changes = 0;

        for (int[] neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            int nextNode = neighbor[0];
            int needsChange = neighbor[1];

            if (!visited[nextNode]) {
                changes += needsChange + dfs(nextNode, graph, visited);
            }
        }

        return changes;
    }

    public static void main(String[] args) {
        ReorderRoutes solution = new ReorderRoutes();

        int[][] connections1 = {{0,1},{1,3},{2,3},{4,0},{4,5}};
        System.out.println("Output: " + solution.minReorder(6, connections1)); // Output: 3

        int[][] connections2 = {{1,0},{1,2},{3,2},{3,4}};
        System.out.println("Output: " + solution.minReorder(5, connections2)); // Output: 2

        int[][] connections3 = {{1,0},{2,0}};
        System.out.println("Output: " + solution.minReorder(3, connections3)); // Output: 0
    }
}
