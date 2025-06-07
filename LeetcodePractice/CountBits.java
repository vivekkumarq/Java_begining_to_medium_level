package LeetcodePractice;

public class CountBits {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        CountBits solution = new CountBits();
        int[] result1 = solution.countBits(2);  
        int[] result2 = solution.countBits(5); 
        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
    }
}
