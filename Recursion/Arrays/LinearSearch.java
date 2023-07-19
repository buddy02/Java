package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 6, 3, 24 ,6};
        System.out.println(search(arr,24,0));
        System.out.println(search2(arr, 6, 0));
        search3(arr, 6, 0);
        // System.out.println(list);
        ArrayList<Integer> li = search4(arr, 6, 0, new ArrayList<>());
        System.out.println(li);
        ArrayList<Integer> li1 = search5(arr, 6, 0);
        System.out.println(li1);
        
        // System.out.println(search4(arr, 6, 0, new ArrayList<>()));
    }

    private static boolean search(int[] arr, int key, int index) {
        if (index == arr.length)
            return false;
        return arr[index]==key || search(arr, key,index+1);
    }

    private static int search2(int[] arr, int key, int index) {
        if (index == arr.length)
            return -1;
        if (arr[index] == key)
            return index;
        else
            return search2(arr, key, index + 1);
    }

    static ArrayList<Integer> list1 = new ArrayList<>();
    private static void search3(int[] arr, int key, int index) {
        if (index == arr.length)
            return ;
        if(arr[index]==key) list1.add(index);
        search3(arr, key,index+1);
    }
    private static ArrayList<Integer> search4(int[] arr, int key, int index,ArrayList<Integer> li) {
        if (index == arr.length)
            return li;
        if(arr[index]==key) li.add(index);
        return search4(arr, key,index+1,li);
    }

    private static ArrayList<Integer> search5(int[] arr, int key, int index) {
        if (index == arr.length)
        return new ArrayList<>();
        ArrayList<Integer> list = search5(arr, key,index+1);
        if (arr[index] == key)
        list.add(index);
        return list;
    }
}
