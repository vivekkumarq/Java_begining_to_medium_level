package LeetcodePractice;

import java.util.*;

public class EvaluateDivision {

    public double[] calcEquation(
        List<List<String>> equations, double[] values, List<List<String>> queries) {

        // Step 1: Build the graph
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            double val = values[i];

            graph.computeIfAbsent(a, k -> new HashMap<>()).put(b, val);
            graph.computeIfAbsent(b, k -> new HashMap<>()).put(a, 1.0 / val);
        }

        // Step 2: Process queries using DFS
        double[] results = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String src = queries.get(i).get(0);
            String dst = queries.get(i).get(1);
            Set<String> visited = new HashSet<>();
            results[i] = dfs(graph, src, dst, 1.0, visited);
        }

        return results;
    }

    private double dfs(Map<String, Map<String, Double>> graph, String src, String dst,
                       double accProduct, Set<String> visited) {

        if (!graph.containsKey(src) || !graph.containsKey(dst)) return -1.0;
        if (src.equals(dst)) return accProduct;

        visited.add(src);

        for (Map.Entry<String, Double> neighbor : graph.get(src).entrySet()) {
            if (visited.contains(neighbor.getKey())) continue;

            double result = dfs(graph, neighbor.getKey(), dst,
                                accProduct * neighbor.getValue(), visited);
            if (result != -1.0) return result;
        }

        return -1.0;
    }


    public static void main(String[] args) {
        EvaluateDivision solution = new EvaluateDivision();

        List<List<String>> eq1 = List.of(List.of("a", "b"), List.of("b", "c"));
        double[] val1 = {2.0, 3.0};
        List<List<String>> queries1 = List.of(
            List.of("a", "c"), List.of("b", "a"), List.of("a", "e"),
            List.of("a", "a"), List.of("x", "x")
        );
        System.out.println(Arrays.toString(solution.calcEquation(eq1, val1, queries1)));
        
    }
}

