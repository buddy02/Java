package Tweak;
// import java.io.*;
import java.util.*;

public class Samba {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i=1;
        while (t-- > 0) {
            int n = in.nextInt();
            System.out.println("Test Case #" + i + ":");
            printBP(n, n, "");
            i++;
        }
        in.close();
    }
    public static void printBP(int o,int c,String up){
        if(o==0 && c==0) {
            System.out.println(up);
            return;
        } 
        if(o>0 && c!=0)
        printBP(o-1,c,up+"{");
        if(o<c && c>0)
        printBP(o,c-1,up+"}");
    }
}
