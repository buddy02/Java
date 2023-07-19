
public class Sieve {
    public static void main(String[] args) {   
        int n = 40;
        boolean[] primes = new boolean[41];
        sieve(n, primes);
    }

    private static void sieve(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            int c = i + i;
            if (primes[i] == false) {
                while (c <= n) {
                    primes[c] = true;
                    c = c + i;
                }
            }
        }
        for (int i = 2; i < primes.length; i++) {
            if(primes[i]==false) System.out.print(i+" ");
        }
        
    }
}
