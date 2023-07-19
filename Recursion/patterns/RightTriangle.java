package Recursion.patterns;

public class RightTriangle {
    public static void main(String[] args) {
        int n = 5;
        pattern2(n, 0);
        pattern(0, 0, n);
        pattern1(n, 0);
    }

    private static void pattern1(int i, int j) {
        if (i == 0)
            return;
        if (i == j) {
            System.out.println();
            pattern1(i - 1, 0);
        } else {
            System.out.print("*");
            pattern1(i, j + 1);
        }
    }

    private static void pattern2(int i, int j) {
        if (i == 0)
            return;
        if (i == j) {
            pattern2(i - 1, 0);
            System.out.println();
        } else {
            pattern2(i, j + 1);
            System.out.print("*");
        }
    }

    private static void pattern(int i, int j, int n) {
        if (i == n + 1) {
            return;
        }
        if (j == n + 1) {
            i += 1;
            j = i - 1;
            System.out.println();
        } else {
            System.out.print("*");
        }
        pattern(i, j + 1, n);
    }
}
