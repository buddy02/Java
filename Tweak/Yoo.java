package Tweak;
// import OOPS.one.hey;

// import Recursion_Qns.Backtracking.ArrayList;

public class Yoo {
    public static void main(String[] args) {
        // jj st = new jj();
        // System.out.println(st.i);
        String str = "hello world";
        bhai(str);
        System.out.println(str);
        jj a = new jj();
        bahi(a);
        System.out.println(a.i);
    }

    private static void bahi(jj a) {
        jj aa = new jj();
        aa.i = 0;
        a = aa;
        System.out.println(a.i);
    }

    private static void bhai(String str) {
        str = "hello";
    }
}

class jj {
    int i = 11;
    String k;
}