package Sorting;
import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,-4,0,3,-2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int t,flag;
        for (int i = 0; i < n-1; i++) {
            flag=0;
            for (int j = 1; j < n-i; j++) {
                if (arr[j] < arr[j - 1]) {
                    t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1]= t;
                    flag=1;
                }
            }
            if(flag==0) break;
        }
    }
}
