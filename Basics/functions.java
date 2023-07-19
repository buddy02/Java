import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        int s = sum(a,b);
        System.out.print(s);
        in.close();
    }

    static int sum(int a,int b) {
        return a + b;
    }
    
}
