package Recursion_Qns.subset;

import java.util.ArrayList;

public class KeypadPhone {
    public static void main(String[] args) {
        String s = "19";
        System.out.println(letterCombination1("", s));
    }

    // private static void letterCombination(String p, String up) {
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     int i = 'a' + (up.charAt(0) - '1') * 3;
    //     char ch = (char) i;
    //     letterCombination(p + (char) (ch), up.substring(1));
    //     letterCombination(p + (char) (ch + 1), up.substring(1));
    //     letterCombination(p + (char) (ch + 2), up.substring(1));
    // }
    
    private static ArrayList<String> letterCombination1(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> li = new ArrayList<>();
        int i = 'a' + (up.charAt(0)-'1')*3;
        char ch = (char) i;
        li.addAll(letterCombination1(p+(char)(ch), up.substring(1)));
        li.addAll(letterCombination1(p+(char)(ch+1), up.substring(1)));
        li.addAll(letterCombination1(p + (char) (ch + 2), up.substring(1)));
        return li;
        
    }
}
