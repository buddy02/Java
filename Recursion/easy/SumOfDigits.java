package Recursion.easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1505;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if(n==0) return 1;
        return n%10 * sum(n/10);
    }
}
