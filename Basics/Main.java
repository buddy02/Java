import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        String a = input.next();
        System.out.println("Hello " + a);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println(n1 + n2);
        input.close();
    }
}