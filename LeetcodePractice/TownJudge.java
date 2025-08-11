package LeetcodePractice;

public class TownJudge {
    public static int findJudge(int n, int[][] trust) {
        int[] trustScore = new int[n + 1]; 

        for (int[] relation : trust) {
            int a = relation[0], b = relation[1];
            trustScore[a]--; 
            trustScore[b]++; 
        }

        for (int i = 1; i <= n; i++) {
            if (trustScore[i] == n - 1) {
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findJudge(2, new int[][]{{1,2}})); 
        System.out.println(findJudge(3, new int[][]{{1,3},{2,3}})); 
        System.out.println(findJudge(3, new int[][]{{1,3},{2,3},{3,1}})); 
    }
}

