package LeetcodePractice;

import java.util.HashSet;
import java.util.Set;

public class IsPathCrossing {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;
        visited.add(x + "," + y);
        for (char c : path.toCharArray()) {
            if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'E') x++;
            else if (c == 'W') x--;
            String pos = x + "," + y;
            if (visited.contains(pos)) return true;
            visited.add(pos);
        }
        return false;
    }

    public static void main(String[] args) {
        IsPathCrossing sol = new IsPathCrossing();
        System.out.println(sol.isPathCrossing("NES")); 
        System.out.println(sol.isPathCrossing("NESWW")); 
    }
}

