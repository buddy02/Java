import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 36;
        factors(n);
    }

    private static void factors(int n) {
        ArrayList<Integer> arr = new ArrayList<>(5);
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n)
                    System.out.print(i + " ");
                else {
                    arr.add(n / i);
                    System.out.print(i + " ");
                }
            }
        }
        for (int i = arr.size()-1; i >= 0; i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
    
}
