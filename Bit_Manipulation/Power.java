package Bit_Manipulation;
import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            Long a = in.nextLong();
            Long b = in.nextLong();
            Long ans = 1L;
            Long base = a;
            while (b != 0) {
                if ((b & 1) == 1)
                    ans = ans * base;
                base = base * base;

                b = b >> 1;
            }
            System.out.println(ans % 10);
        }
        in.close();
    }
}
