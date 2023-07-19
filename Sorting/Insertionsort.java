package Sorting;
import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = { 53, -4, 0, 3, -22, 1 };
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void Insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j=i+1;j > 0;j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
}
