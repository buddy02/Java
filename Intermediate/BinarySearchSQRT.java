public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 35;
        System.out.printf("%.3f ", sqrt(n, 3));
    }
    
    private static double sqrt(int n,int p) {
        int s = 0;
        int e = n;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == n)
                return mid;
            if (mid * mid < n)
                s = mid + 1;
            else
                e = mid - 1;
        }
        double root = e;
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {

                root += inc;
            }
            root = root - inc;
            inc = inc / 10;
        }
        return root;
    }
}
