public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7, 8, 12, 44 };
        int key = 3;
        System.out.println(binarySearch(arr, key, 0, arr.length - 1));
    }

    private static int binarySearch(int[] arr, int key, int s, int e) {
        int mid = (s + e) / 2;
        if (s <= e) {   
            if(key==arr[mid])
            return mid;
            else if(key<arr[mid])
            return binarySearch(arr, key, s, mid - 1);
            else if (key > arr[mid])
            return binarySearch(arr, key, mid + 1, e);
        }
            return -1;
    }
}
