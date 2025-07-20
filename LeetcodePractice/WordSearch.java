package LeetcodePractice;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

  
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int i, int j, int index) {
       
        if (index == word.length()) {
            return true;
        }

        
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || board[i][j] != word.charAt(index)) {
            return false;
        }

        
        char temp = board[i][j];
        board[i][j] = '#';

        
        boolean found = dfs(board, word, i + 1, j, index + 1)
                || dfs(board, word, i - 1, j, index + 1)
                || dfs(board, word, i, j + 1, index + 1)
                || dfs(board, word, i, j - 1, index + 1);

        
        board[i][j] = temp;

        return found;
    }

    public static void main(String[] args) {
        char[][] board1 = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word1 = "ABCCED";
        System.out.println(exist(board1, word1));

        String word2 = "SEE";
        System.out.println(exist(board1, word2)); 

        String word3 = "ABCB";
        System.out.println(exist(board1, word3)); 
    }
}

