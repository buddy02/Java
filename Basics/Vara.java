import java.util.Arrays;

public class Vara {
    public static void main(String[] args) {
        fun(2,"Rahul","Ramesh");
    }

    static void fun(int a,String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
