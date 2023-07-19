public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
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
}