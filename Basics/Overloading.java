import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(2);
        fun("Ramesh");
        demo(1, 2, 3, 7, 5);
        demo("raw","sew");
        // demo(); error
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String a) {
        System.out.println(a);
    }
}
