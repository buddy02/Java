package Sorting;
import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        int[] arr = {5,4,7,3,6,2,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cycle(int[] arr) {
        int i=0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1])
                swap(arr, i, arr[i] - 1);
            else
                i++;
        }
        // for (int i = 0; i < arr.length; i++) {
        //     while (arr[i] != i + 1) {
        //         swap(arr, arr[i]-1, i);
        //         // int temp = arr[i];
        //         // arr[i] = arr[arr[i] - 1];
        //         // arr[temp - 1] = temp;
        //     }
        // }
    }
    private static void swap(int[] arr, int max, int i) {
        int temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
    }
}
