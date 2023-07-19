package Tweak;
import java.util.ArrayList;
class aa {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<Integer>(3);
        s.add(2);
        s.add(9);
        ArrayList<Integer> k = s;
        System.out.println(k);

        System.out.println(s);
        s = new ArrayList<>();
        System.out.println(s);
    }
}