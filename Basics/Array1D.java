//import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        arr[1] = 3;
        // System.out.println(Arrays.toString(arr));
        
        in.close();
    }
}
