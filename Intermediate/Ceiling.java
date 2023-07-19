public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 14, 16, 23, 29, 44 };
        int key = 18;
        int s = 0;
        int e = arr.length - 1;
        if (arr[e] < key)
            System.out.println(-1);
        else {
            System.out.println(ceil(arr, key, s, e));
        }
        if (arr[e] < key)
            System.out.println(-1);
        else {
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (key == arr[m]) {
                    System.out.println(arr[m]);
                    break;
                } else if (key < arr[m])
                    e = m - 1;
                else
                    s = m + 1;
            }
            if (s > e)
                System.out.println(arr[s]);
        }
    }

    private static int ceil(int[] arr, int key, int s, int e) {
        if (s > e)
            return arr[s];
        int m = s + (e - s) / 2;
        if (key == arr[m])
            return arr[m];
        if (key < arr[m])
            return ceil(arr, key, s, m - 1);
        return ceil(arr, key, m + 1, e);

    }
}
