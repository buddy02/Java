package org.example;

public class Robber {
    public static void main(String[] args) {
        int[] profit = {3,1,5,4};
        int k = 2;
        System.out.println(findProfit(profit,k,0,0));
    }
    public static int findProfit(int[] profit,int k,int i,int profits) {
        if(i>=profit.length) return profits;
        if(k==0) return 0;
        int ans1 = findProfit(profit,k-1,i+2,profits + profit[i]);
        int ans2 = findProfit(profit,k,i+1,profits);
        return Math.max(ans1,ans2);
    }
}
