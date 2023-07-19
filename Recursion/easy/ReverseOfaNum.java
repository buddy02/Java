package Recursion.easy;

public class ReverseOfaNum {
    public static void main(String[] args) {
        int n = 1545;
        System.out.println(rev(n));
        // System.out.println(Math.pow(10, (Math.log(n) / Math.log(10))));
        // rev(n);
    }

    static int sum = 0;

    // private static void rev(int n) {
    //     if (n == 0) {
    //         System.out.println(sum);
    //         return;
    //     }
    //     int r = n % 10;
    //     sum = sum * 10 + r;
    //     rev(n / 10);
    // }
    
    private static int rev(int n) {
        if (n % 10 == n)
            return n;
        int po = (int) Math.pow(10, (int)(Math.log(n) / Math.log(10)));
        return (n%10)*po + rev(n/10); 
    }
}
