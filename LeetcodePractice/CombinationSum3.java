package LeetcodePractice;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int k, int remaining, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == k && remaining == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        if (path.size() > k || remaining < 0) {
            return; 
        }

        for (int i = start; i <= 9; i++) {
            path.add(i);
            backtrack(i + 1, k, remaining - i, path, result);
            path.remove(path.size() - 1); 
        }
    }

    public static void main(String[] args) {
        CombinationSum3 solver = new CombinationSum3();
        
        System.out.println(solver.combinationSum3(3, 7));  
        System.out.println(solver.combinationSum3(3, 9));  
        System.out.println(solver.combinationSum3(4, 1));  
    }
}
