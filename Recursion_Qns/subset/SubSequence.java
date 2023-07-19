package Recursion_Qns.subset;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        // ArrayList<String> li =  new ArrayList<>();
        System.out.println(subset2(s, ""));
    }

    // private static void subset(String up, String p) {
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     char c = up.charAt(0);
    //     subset(up.substring(1), p + c);
    //     subset(up.substring(1), p);
    // }

    // // static ArrayList<String> li = new ArrayList<>();
    // private static ArrayList<String> subset1(String up,String p,ArrayList<String> li) {
    //     ArrayList<String> l = new ArrayList<>();
    //     if (up.isEmpty()) {
    //         l.add(p);
    //         return l;
    //     }
    //     char c = up.charAt(0);
    //     l.addAll(subset1(up.substring(1), p + c, li));
    //     l.addAll(subset1(up.substring(1), p, li));
    //     return l;
    // }
    private static ArrayList<String> subset2(String up,String p) {
        ArrayList<String> l = new ArrayList<>();
        if (up.isEmpty()) {
            l.add(p);
            return l;
        }
        char c = up.charAt(0);
        l.addAll(subset2(up.substring(1), p + c));
        l.addAll(subset2(up.substring(1), p));
        return l;
    }
}
