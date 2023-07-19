package org.example;

import java.util.HashMap;

public class makeN {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(rec(1,n));
    }
    public static HashMap<Integer,Integer> mp = new HashMap<>();

    private static int rec(int i, int n) {
        if(i>n) return 0;
        if(i==n) return 1;
        if(mp.get(i) == null) {
            int ans = rec(i*2,n) + rec(i+1,n);
            mp.put(i,ans);
            return ans;
        }
        return mp.get(i);

    }
//    public static void main(String[] args) {
//        HashMap<Integer,Integer> mp = new HashMap<>();
//        mp.put(1,100);
//        mp.put(2,200);
//        System.out.println(mp.get(1));;
//    }
}

