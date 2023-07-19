package Recursion.patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0 };
        sort1(arr, arr.length, 0, 0);
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr,int i,int j,int max) {
        if (i == arr.length-1)
            return;
        if (j < arr.length - i) {
            if (arr[j] > arr[max]) {
                max = j;
            }
            sort(arr, i, j + 1, max);
        }
        else {
            int temp = arr[max];
            arr[max] = arr[j - 1];
            arr[j - 1] = temp;
            sort(arr, i+1, 1, 0);
        }
    }
    private static void sort1(int[] arr,int i,int j,int max) {
        if (i == 0)
            return;
        if (j < i) {
            if (arr[j] > arr[max]) {
                max = j;
            }
            sort1(arr, i, j + 1, max);
        }
        else {
            int temp = arr[max];
            arr[max] = arr[j - 1];
            arr[j - 1] = temp;
            sort1(arr, i-1, 1, 0);
        }
    }

}
