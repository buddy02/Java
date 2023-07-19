package Bit_Manipulation;

public class NumberAppearing {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 2, 2, 3, 3 };
        System.out.println(appearingOnce(arr));
    }

    private static int appearingOnce(int[] arr) {
        int[] ans = new int[32];
        for (int i = 0; i < 32; i++) {
            for (int x : arr) {
                ans[31-i] += (x>>i & 1);
            }
        }
        int k = 0;
        for (int x : ans) {
            if (x % 3 != 0)
                k += 1;
            k <<= 1;
        }
        k >>= 1; 
        return k;
    }
}
