public class palindrome {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("absba");
        StringBuilder s = new StringBuilder();
        int n=str.length();
        for (int i = 0; i < n; i++) {
            s = s.append(str.charAt(n - i - 1));
        }
        System.out.print(s);
        System.out.print(str);
        System.out.print(str);
        if(s.toString().equals(str.toString())) 
            System.out.println("yeah");
        else System.out.println("NO");
    }
}
