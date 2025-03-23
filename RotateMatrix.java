public class RotateMatrix {
    public static void rotate(int[][] matrix) {
    int n = matrix.length;

   
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
           
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    for (int i = 0; i < n; i++) {
        int left = 0, right = n - 1;
        while (left < right) {
         
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            left++;
            right--;
        }
    }
}


public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
        for (int value : row) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {


    int[][] matrix1 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    System.out.println("Original matrix:");
    printMatrix(matrix1);
    rotate(matrix1);
    System.out.println("\nRotated matrix:");
    printMatrix(matrix1);

    int[][] matrix2 = {
        {5, 1, 9, 11},
        {2, 4, 8, 10},
        {13, 3, 6, 7},
        {15, 14, 12, 16}
    };

    System.out.println("\nOriginal matrix:");
    printMatrix(matrix2);
    rotate(matrix2);
    System.out.println("\nRotated matrix:");
    printMatrix(matrix2);
}
    
}
