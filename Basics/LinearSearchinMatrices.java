import java.util.Arrays;

class LinearSearchinMatrices {
    public static void main(String[] args) {
        int[][] matrix = {
            {2,9,6},
            {4,2,9},
            {7,1,3}
        };
        int target = 1;
        System.out.println(Arrays.toString(search(matrix,target)));
    }

    private static int[] search(int[][] matrix,int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] {-1,-1};
    }
}