public class Shadowing {
    static int x=9;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 10;
        System.out.println(x);
        hei();
        System.out.println(x);

    }

    static void hei() {
        System.out.println(x);
    }
}
