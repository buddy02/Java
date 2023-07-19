package Bit_Manipulation;

public class SetithBit {
    public static void main(String[] args) {
        int n = 43;
        int i = 4;
        System.out.println(Integer.toString(n,2));
        System.out.println(Integer.toString(findithBit(n, i),2));
    }

    private static int findithBit(int n, int i) {
        return n | (1 << i);
    }
}
