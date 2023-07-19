package Recursion.easy;

public class CountZeroes {
    static int count = 0;

    private static void countzero(int n) {
        if (n == 0)
            return;
        if (n % 10 == 0)
            count++;
        countzero(n / 10);
    }

    private static int countzero1(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n == 0)
            return count;
        if (n % 10 == 0)
            count++;
        return helper(n / 10, count);

    }

    public static void main(String[] args) {
        int n = 300203;
        countzero(n);
        System.out.println(countzero1(n));
    }

}
