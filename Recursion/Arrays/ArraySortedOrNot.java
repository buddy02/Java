package Recursion.Arrays;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = { 1, 3,2, 3, 4 };   
        sorted(arr);
    }

    private static void sorted(int[] arr) {
        helper(arr, 0);
        System.out.println(helper1(arr,0));
    }

    private static void helper(int[] arr, int i) {
        if (i == arr.length - 1) {
            System.out.println("Yes");
            return;
        }
        if(arr[i]<=arr[i+1])
            helper(arr, i + 1);
        else {
            System.out.println("No");
            return;
        }
    }
    private static boolean helper1(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return (arr[i]<=arr[i+1] && helper1(arr, i + 1));
    }
}
