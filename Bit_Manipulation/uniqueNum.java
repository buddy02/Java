package Bit_Manipulation;
public class uniqueNum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 4, 3, 4, 2 };
        int unique = 0;
        for(int x:arr)
        {
            unique ^= x;
        }
        System.out.println(unique);
    }
}
