package LeetcodePractice;

public class MinDeletionSize {
    public static int minDeletionSize(String[] strs) {
        int n = strs.length, m = strs[0].length();
        int count = 0;
        for (int col = 0; col < m; col++) {
            for (int row = 1; row < n; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strs1 = {"cba","daf","ghi"};
        String[] strs2 = {"a","b"};
        String[] strs3 = {"zyx","wvu","tsr"};
        
        System.out.println(minDeletionSize(strs1)); 
        System.out.println(minDeletionSize(strs2)); 
        System.out.println(minDeletionSize(strs3)); 
    }
}

