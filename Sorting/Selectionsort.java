package Sorting;
import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {-4,6,3,0,-33};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length-i-1;
            int first = 0;
            int max=getMaxIndex(arr, first, last);
            swap(arr, max, last);
        }
    }

    private static int getMaxIndex(int[] arr, int first, int last) {
        int max = first;
        for (int i = first + 1; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int max, int i) {
        int temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
    }

    // private static void selection1(int[] arr) {
    //     int max, temp, n = arr.length;
    //     for (int i = 0; i < n-1; i++) {
    //         max = 0;
    //         for (int j = 0; j < n - i; j++) {
    //             if (arr[j] > arr[max])
    //                 max = j;
    //         }
    //         temp = arr[max];
    //         arr[max] = arr[n - i - 1];
    //         arr[n - i - 1] = temp;
    //     }
    // }
}
