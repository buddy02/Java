package Recursion.Arrays;

public class RBS {
    public static void main(String[] args) {

        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
        int target = 8;
        System.out.println(rbs(arr, target, 0, arr.length - 1));
    }

    private static int rbs(int[] arr, int target, int s, int e) {
        if (s > e)
            return -1;
        int m = s + (e - s) / 2;
        if (arr[m] == target)
            return m;
        if (arr[0] <= arr[m]) {
            if (target >= arr[0] && target < arr[m])
                return rbs(arr, target, s, m - 1);
            else
                return rbs(arr, target, m + 1, e);
        }
        if (target < arr[0] && target > arr[m])
            return rbs(arr, target, m + 1, e);
        return rbs(arr, target, s, m - 1);

    }
}
