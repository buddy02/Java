package Recursion.easy;

public class PrintNums {
    public static void main(String[] args) {   
        int n = 5;
        System.out.println(print(n));
        print2(n); 
        print1(n); 
    }

    private static void print1(int n) {
        if (n == 0)
            return;
        print1(n - 1);
        System.out.println(n);
    }

    private static int print(int n) {
        if (n == 1)
            return 1;
        System.out.println(n);
        return print(n - 1);
    }
    
    private static void print2(int n) {
        if (n == 0)
            return ;
        System.out.println(n);
        print2(n - 1);
        System.out.println(n);
    }
}
