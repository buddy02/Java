package Recursion_Qns.Backtracking;

public class N_Queens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueens(board, 0));
    }

    private static int nQueens(boolean[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (canPlace(board, row, i)) {
                board[row][i] = true;
                count += nQueens(board, row + 1);
                board[row][i] = false;
            }
        }
        return count;
    }

    private static void printBoard(boolean[][] board) {
        for (boolean[] i : board) {
            for (boolean x : i) {
                if (x) {
                    System.out.print("Q");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    private static boolean canPlace(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == true) {
                return false;
            }
        }
        int min = Math.min(row , col);
        for (int i = 1; i <= min; i++) {
            if (board[row - i][col - i] == true) {
                return false;
            }
        }
        min = Math.min(board.length - col - 1, row);
        for (int i = 1; i <= min; i++) {
            if (board[row - i][col + i] == true) {
                return false;
            }
        }
        return true;
    }

}