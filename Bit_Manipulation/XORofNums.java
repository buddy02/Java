package Bit_Manipulation;

public class XORofNums {
    public static void main(String[] args) {
        int a = 99;
        int b = 9996;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
        int ans1 = 0;
        for (int i = a; i <= b; i++) {
            ans1 ^= i;
        }
        System.out.println(ans1);
    }

    private static int xor(int a) {
        if (a % 4 == 0) return a;
        if (a % 4 == 1) return 1;
        if (a % 4 == 2) return a+1;
        return 0;
    }
}
