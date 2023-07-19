package Recursion_Qns.permutations;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(permu("",s));
    }

    // private static void per(String p, String up) {
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);
    //     for (int i = 0; i <= p.length(); i++) {
    //         per(p.substring(0, i) + ch + p.substring(i, p.length()), up.substring(1));
    //     }
    // }

    // private static int permucount(String p, String up) {
    //     if (up.isEmpty()) {
    //         return 1;
    //     }
    //     int count = 0;
    //     char ch = up.charAt(0);
    //     for (int i = 0; i <= p.length(); i++) {
    //         count += permucount(p.substring(0, i) + ch + p.substring(i, p.length()), up.substring(1));
    //     }
    //     return count;
    // }

    private static ArrayList<String> permu(String p, String up) {
        ArrayList<String> li = new ArrayList<>();
        if (up.isEmpty()) {
            li.add(p);
            return li;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            li.addAll(permu(p.substring(0, i) + ch + p.substring(i, p.length()), up.substring(1)));
        }
        return li;
    }
}
