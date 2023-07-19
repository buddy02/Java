package Recursion.patterns;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 3,2,1 };
        sort(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int i, int j) {
        if (i == arr.length)
            return;
        if (j < arr.length-1-i) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j+1);
            }
            sort(arr, i, j + 1);
        }
        else {
            sort(arr, i + 1, 0);
        }
    }

    private static void swap(int[] arr,int j) {
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
    }
}
