package LeetcodePractice;

public class MinimumMovesToConvertString {
    public static int minimumMoves(String s) {
        int moves = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 3;
            } else {
                i++;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        System.out.println(minimumMoves("XXX"));  
        System.out.println(minimumMoves("XXOX")); 
        System.out.println(minimumMoves("OOOO"));  
    }
}

