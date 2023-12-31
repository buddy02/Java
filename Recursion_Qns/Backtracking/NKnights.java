package Recursion_Qns.Backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        int knights = 3; 
        Knights(board, 0, 0, knights);
    }

    private static void Knights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            printBoard(board);
            System.out.println();
            return;
        }
        if (row == board.length-1 && col == board.length) {
            return;
        }
        if (col == board.length) {
            Knights(board, row+1, 0, knights);
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            Knights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        Knights(board, row, col+1, knights);
    }


    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row-2, col-1)) {
            if (board[row-2][col-1]) {
                return false;
            }
        }
        if (isValid(board, row-2, col+1)) {
            if (board[row-2][col+1]) {
                return false;
            }
        }
        if (isValid(board, row-1, col-2)) {
            if (board[row-1][col-2]) {
                return false;
            }
        }
        if (isValid(board, row-1, col+2)) {
            if (board[row-1][col+2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(boolean[][] board,int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void printBoard(boolean[][] board) {
        for (boolean[] i : board) {
            for (boolean x : i) {
                if (x) {
                    System.out.print("K");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
