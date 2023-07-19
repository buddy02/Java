public class MagicNumber {
    public static void main(String[] args) {
        int ans = 0;
        int n = 6;
        int base = 5;
        while (n != 0) {
            int last = n & 1;
            ans += last * base;
            base *= 5;
            n = n >> 1;
        }
        // for (int i = 1; n != 0; i++) {
        //     int r = (n & 1);
        //     ans = (int) (ans + r * Math.pow(5, i));
        //     n = n >> 1;
        // }
        System.out.println(ans);
        }
}
