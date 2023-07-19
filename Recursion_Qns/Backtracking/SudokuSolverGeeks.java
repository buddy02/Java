package Recursion_Qns.Backtracking;

public class SudokuSolverGeeks {
    public static void main(String[] args) {
        int[][] board = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        if(solve(board, 0, 0))
            printBoard(board);
        else System.out.println("No Solution exists");

    }

    private static boolean solve(int[][] board, int row, int col) {
        if (row == board.length - 1 && col == board.length) {
            return true;
        }
        if (col == board.length) {
            row++;
            col = 0;
        }

        if (board[row][col] != 0) {
            return solve(board, row, col + 1);
        }
            for (int num = 1; num <= 9; num++) {
                if (isSafe(board, row, col, num)) {
                    board[row][col] = num;
                    if (solve(board, row, col+1)) {
                        return true;
                    }

                }
                board[row][col] = 0;
            }

        return false;

    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num && i != row) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num && i != col) {
                return false;
            }
        }
        int sr = row - row % 3;
        int sc = col - col % 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printBoard(int[][] board) {
        for (int[] i : board) {
            for (int x : i) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

}
