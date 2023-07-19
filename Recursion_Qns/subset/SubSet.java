package Recursion_Qns.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = { 1, 2,2 };
        System.out.println(subSetWithDuplicates(arr));
    }

    public static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int x : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>();
                inner.addAll(outer.get(i));
                inner.add(x);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subSetWithDuplicates(int[] arr) {
        Arrays.sort(arr);
        int s,e=0;
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {
            s = 0;
            if (i > 0 && arr[i] == arr[i - 1])
                s = e;
            e = outer.size();
            for (int j = s; j < e; j++) { 
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
