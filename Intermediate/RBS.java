public class RBS {
    public static void main(String[] args) {
        int[] arr = { 1,0,1,1,1};
        int key = 1;
        System.out.println(search(arr,key));
    }
    private static int search(int[] arr,int key) {
        int pivot = findPivot(arr);
        int ans = binarySearch(arr, key, 0, pivot);
        if(ans==-1)
            ans = binarySearch(arr, key, pivot + 1, arr.length - 1);
        return ans;
    }
    private static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        if (arr.length == 0)
            return -2;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m + 1])
                return m;
            if (arr[0] > arr[m])
                e = m - 1;
            else
                s = m + 1;
        }
        if (s == arr.length - 1)
            return -1;
        return s;
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
