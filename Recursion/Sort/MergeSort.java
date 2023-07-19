package Recursion.Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 3, 4, 4, 1, 9 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // private static int[] mergeSort(int[] arr) {
    // if (arr.length == 1)
    // return arr;
    // else {
    // int m = arr.length / 2;
    // int[] left = mergeSort(Arrays.copyOfRange(arr, 0, m));
    // int[] right = mergeSort(Arrays.copyOfRange(arr, m, arr.length));
    // return merge(left, right);
    // }
    // }

    private static void mergeSort(int[] arr, int s, int e) {
        if (s == e)
            return;
        else {
            int m = s + (e - s) / 2;
            // return merge(mergeSort(arr,s,m), mergeSort(arr, m+1, e));
            mergeSort(arr, s, m);
            mergeSort(arr, m + 1, e);
            merge1(arr, s, m, e);
        }
    }

    private static void merge1(int[] arr, int s, int m, int e) {
        int k = 0;
        int i = s, j = m + 1;
        int[] brr = new int[e - s + 1];
        while (i <= m && j <= e) {
            if (arr[i] < arr[j]) {
                brr[k] = arr[i];
                i++;
            } else {
                brr[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
            brr[k] = arr[i];
            i++;
            k++;
        }
        while (j <= e) {
            brr[k] = arr[j];
            j++;
            k++;
        }
        for (k = 0; k < brr.length; k++) {
            arr[s + k] = brr[k];
        }
    }

    // private static int[] merge(int[] arr1, int[] arr2) {
    // int a = arr1.length;
    // int b = arr2.length;
    // int i = 0, j = 0, k = 0;
    // int[] brr = new int[a + b];
    // while (i < a && j < b) {
    // if (arr1[i] < arr2[j]) {
    // brr[k] = arr1[i];
    // i++;
    // } else {
    // brr[k] = arr2[j];
    // j++;
    // }
    // k++;
    // }
    // while (i < a) {
    // brr[k] = arr1[i];
    // i++;
    // k++;
    // }
    // while (j < b) {
    // brr[k] = arr2[j];
    // j++;
    // k++;
    // }
    // return brr;
    // }

    // private static int[] merge(int[] arr,int s,int m,int e) {
    // int i = s, j = m+1, k = 0;
    // while (i <= m && j <= e) {
    // if (arr[i] > arr[j]) {
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = arr[i];
    // j++;
    // } else {
    // i++;
    // j = m + 1;
    // }
    // }
    // while (i <= m) {
    // brr[k] = arr[i];
    // i++;
    // k++;
    // }
    // while (j <= e) {
    // brr[k] = arr[j];
    // j++;
    // k++;
    // }
    // return arr;
    // }
}
