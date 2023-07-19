import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
            {10,20,30,40},
            {15,23,31,42},
            {19,25,34,46},
            {22,28,39,50}
        };
        int key = 10;
        System.out.println(Arrays.toString(search(matrix,key)));
    }

    private static int[] search(int[][] matrix,int key) {
        int row = 0;
        int col = matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                return new int[] { row, col };
            } else if (matrix[row][col] < key) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }
}
