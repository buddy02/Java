import java.util.Arrays;

public class BSInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int key = 5;
        // System.out.println(search(matrix, key));
        System.out.println(Arrays.toString(search(matrix, key)));
    }

    private static int[] bs(int[][] arr, int row, int s, int e, int key) {
        int m;
        while (s <= e) {
            m = (s + e) / 2;
            if (arr[row][m] == key)
                return new int[] { row, m };
            else if (arr[row][m] < key) {
                s = m + 1;
            } else
                e = m - 1;
        }
        return new int[] { -1, -1 };
    }

    // private static int[] search(int[][] matrix, int key) {
    //     int[] ans = { -1, -1 };
    //     int rowStart = 0;
    //     int rowEnd = matrix.length - 1;
    //     int col = rowEnd / 2;
    //     int m;
    //     while (rowStart < rowEnd - 1) {
    //         m = (rowStart + rowEnd) / 2;
    //         if (matrix[m][col] == key)
    //             return new int[] { m, col };
    //         if (matrix[m][col] < key)
    //             rowStart = m;
    //         if (matrix[m][col] > key)
    //             rowEnd = m;
    //     }
    //     ans = bs(matrix, rowStart, 0, matrix.length - 1, key);
    //     if (ans[0] == -1)
    //         ans = bs(matrix, rowEnd, 0, matrix.length - 1, key);
    //     return ans;
    // }

    private static int[] search(int[][] matrix, int key) {
        int[] ans = { -1, -1 };
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int col = rowEnd / 2;
        int m;
        while (rowStart < rowEnd - 1) {
            m = (rowStart + rowEnd) / 2;
            if (matrix[m][col] == key)
                return new int[] { m, col };
            if (matrix[m][col] < key)
                rowStart = m;
            if (matrix[m][col] > key)
                rowEnd = m;
        }

        if(key<matrix[rowStart][col]) {
            return bs(matrix, rowStart, 0, col-1, key);
        }
        else if(key>matrix[rowStart][col] && key<matrix[rowEnd][0]) {
            return bs(matrix, rowStart, col+1, matrix.length - 1, key);
        }
        else if(key<matrix[rowEnd][col]) {
            return bs(matrix, rowEnd, 0, col-1, key);
        }
        else if(key>matrix[rowEnd][col]) {
            return bs(matrix, rowEnd, col+1, matrix.length - 1, key);
        }
        // ans = bs(matrix, rowStart, 0, matrix.length - 1, key);
        // if (ans[0] == -1)
        //     ans = bs(matrix, rowEnd, 0, matrix.length - 1, key);
        return ans;
    }

}
