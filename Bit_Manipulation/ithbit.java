package Bit_Manipulation;

public class ithbit {
    public static void main(String[] args) {
        int n = 43;
        int i = 5;
        System.out.println(Integer.toString(n,2));
        System.out.println(findithBit(n, i));
    }

    private static int findithBit(int n, int i) {
        return (n & (1 << i))>>i;
    }
}
