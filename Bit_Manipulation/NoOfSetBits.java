package Bit_Manipulation;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 31;
        int count = 0;
        // while (n > 0) {
        //     n = n - (n & (-n));
        //     count++;
        // }
        // System.out.println(count);
        while (n > 0) {
            n &= n-1;
            count++;
        }
        System.out.println(count);
    }
}
