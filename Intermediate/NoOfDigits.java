public class NoOfDigits {
    public static void main(String[] args) {
        int n = 15;
        int digits = (int) (Math.log(n) / Math.log(2))+1;
        System.out.println(digits);
    }
}
