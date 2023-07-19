import java.util.Scanner;

public class typeconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 300;
        byte b = (byte) a; // (b=a%256)
        // byte c = 20;
        // byte d = 10;
        // b = c * d;   (not possible because c * d is a integer)
        int e = 'A';
        int d = 2;
        System.out.println(b);
        System.out.println(e+""+d);
        sc.close();
    }
    
}
