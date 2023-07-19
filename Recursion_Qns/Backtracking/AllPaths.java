package Recursion_Qns.Backtracking;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        int[][] path = new int[board.length][board[0].length];
        mazeRestrictions(0, 0, board, "", path, 1);

    }

    private static void mazeRestrictions(int r, int c, boolean[][] board, String p, int[][] path, int i) {
        if (board[r][c] == false) {
            return;
        }
        path[r][c] = i;
        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(p);
            for (int[] j : path) {
                for (int x : j) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            return;
        }
        board[r][c] = false;
        if (r < board.length - 1) {
            mazeRestrictions(r + 1, c, board, p + 'D', path, i + 1);
        }
        if (c < board[0].length - 1) {
            mazeRestrictions(r, c + 1, board, p + 'R', path, i + 1);
        }
        if (r > 0) {
            mazeRestrictions(r - 1, c, board, p + 'U', path, i + 1);
        }
        if (c > 0) {
            mazeRestrictions(r, c - 1, board, p + 'L', path, i + 1);
        }
        board[r][c] = true;
        path[r][c] = 0;
    }

    // private static void mazeRestrictions(int r, int c, boolean[][] board, String
    // p) {
    // if (r == board.length - 1 && c == board[0].length - 1) {
    // System.out.println(p);
    // return;
    // }
    // if (board[r][c] == false) {
    // return;
    // }
    // board[r][c] = false;
    // if (r < board.length - 1) {
    // mazeRestrictions(r + 1, c, board, p + 'D');
    // }
    // if (c < board[0].length - 1) {
    // mazeRestrictions(r, c + 1, board, p + 'R');
    // }
    // if (r > 0) {
    // mazeRestrictions(r-1, c, board, p + 'U');
    // }
    // if (c > 0) {
    // mazeRestrictions(r, c - 1, board, p + 'L');
    // }
    // board[r][c] = true;
    // }
}
