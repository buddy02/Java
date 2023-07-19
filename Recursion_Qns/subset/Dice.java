package Recursion_Qns.subset;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        int up = 7;
        System.out.println(dice1("", up));
        diceFace("", up, 7);
    }

    private static ArrayList<String> dice1(String p, int up) {
        if (up == 0) {
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> li = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= up; i++) {
            li.addAll(dice1(p + i, up - i));
        }
        return li;
    }

    // private static void dice(String p, int up) {
    //     if (up == 0) {
    //         System.out.println(p);
    //         return;
    //     }

    //     for (int i = 1; i <= 6 && i <= up; i++) {
    //         dice(p + i, up - i);
    //     }
    // }


    private static void diceFace(String p, int up,int face) {
        if (up == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= up; i++) {
            diceFace(p + i, up - i,face);
        }
    }

}
