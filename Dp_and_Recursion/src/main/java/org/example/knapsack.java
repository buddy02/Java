package org.example;

import java.util.HashMap;

public class knapsack {
    public static void main(String[] args) {
        int[] weight = {4,5,1};
        int[] cost = {1,2,3};
        int k = 4;
        System.out.println(findProfit(weight,cost,k,0));
    }
    private static int findProfit(int[] weight, int[] cost, int k,int i) {
        if(k<0) return Integer.MIN_VALUE;
        if(i==weight.length) return 0;
        int ans1 = findProfit(weight,cost,k-weight[i],i+1) + cost[i];
        int ans2 = findProfit(weight,cost,k,i+1);
        return Math.max(ans1,ans2);
    }
}
