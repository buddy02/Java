package Recursion_Qns.Backtracking;

import java.util.List;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(maze(3, 3));
        maze1(3, 3, "");
        System.out.println(maze2(3, 3, ""));
        System.out.println(mazeDiagonal(3, 3, ""));
        boolean[][] board = {
                { true, true, true },
                { true, false, true },
                { true, true, true },
        };
        mazeRestrictions(0, 0, board, "");
    }

    private static int maze(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int down = maze(r - 1, c);
        int right = maze(r, c - 1);
        return down + right;
    }

    private static void maze1(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1)
            maze1(r - 1, c, p + 'D');
        if (c > 1)
            maze1(r, c - 1, p + 'R');
    }

    private static List<String> maze2(int r, int c, String p) {
        if (r == 1 && c == 1) {
            List<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        List<String> li = new ArrayList<>();
        if (r > 1)
            li.addAll(maze2(r - 1, c, p + 'D'));
        if (c > 1)
            li.addAll(maze2(r, c - 1, p + 'R'));
        return li;
    }

    private static List<String> mazeDiagonal(int r, int c, String p) {
        if (r == 1 && c == 1) {
            List<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        List<String> li = new ArrayList<>();
        if (r > 1 && c > 1)
            li.addAll(mazeDiagonal(r - 1, c - 1, p + 'D'));
        if (r > 1)
            li.addAll(mazeDiagonal(r - 1, c, p + 'V'));
        if (c > 1)
            li.addAll(mazeDiagonal(r, c - 1, p + 'H'));
        return li;
    }

    private static void mazeRestrictions(int r, int c, boolean[][] board, String p) {
        if (board[r][c] == false)
            return;
        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (r < board.length - 1)
            mazeRestrictions(r + 1, c, board, p + 'D');
        if (c < board[0].length - 1)
            mazeRestrictions(r, c + 1, board, p + 'R');
    }
}
