package LeetcodePractice;

public class Chessboard {
     public boolean squareIsWhite(String coordinates) {
        char col = coordinates.charAt(0);
        int row = coordinates.charAt(1) - '0';
        return ((col - 'a' + 1) + row) % 2 == 1;
    }

    public static void main(String[] args) {
        Chessboard sol = new Chessboard();
        System.out.println(sol.squareIsWhite("a1")); 
        System.out.println(sol.squareIsWhite("h3")); 
        System.out.println(sol.squareIsWhite("c7")); 
    }
}
