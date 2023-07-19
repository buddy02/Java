
public class Pattern1 {
    public static void main(String[] args) {
        pattern16(5);
    }

    private static void pattern16(int n) {
        n = 19;
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j + i) % 4 == 0 || (i==2 && j%4==0))
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        
            
    }

    // private static void pattern3(int n) {
    //     int ori=n;    
    //     n=2*n-2;
    //     int n1=0,n2=0,n3=0,n4=0;
    //     for (int i = 0; i <= n; i++) {
    //         for (int j = 0; j <= n; j++) {
    //             n1=i;
    //             n2=n-i;
    //             n3 = j;
    //             n4 = n - j;
    //             int min = (n1 < n2) ? n1 : n2;
    //             min = (min < n3) ? min : n3;
    //             min = (min < n4) ? min : n4;
    //             System.out.print(ori-min);
    //         }

    //         System.out.println();
    //     }

    // }
    public static void pattern20(int n) {
        n = 10;
        for (int i = 1; i <= n; i++) {
            // for (int s = 1; s <= n - i; s++) {
            //     System.out.print(" ");
            // }
            for (int j = 1; j <= n; j++) {
                if(j==1 || j==n || i==j || i==n-j+1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    // private static void pattern2(int n) {
    //     for (int i = 1; i < 2 * n; i++) {
    //         int c = (i <= n) ? i : 2 * n - i;
    //         for (int j = 1; j <= c; j++) {
    //             System.out.print("*");
    //         }
    //         for (int space = 1; space <= 2 * (n - c); space++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <= c; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern1(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int space = 0; space < i; space++)
    //             System.out.print(" ");
    //         for (int j = n; j >= i; j--) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

}
