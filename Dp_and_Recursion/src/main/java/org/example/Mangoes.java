package org.example;

public class Mangoes {
    public static void main(String[] args) {
        int[][] arr = {{0,1,1},{0,1,0},{0,1,1}};
        int[][] ar = new int[arr.length][arr[0].length];
        System.out.println(findMangoes(arr,0,0,ar));
    }

    public static int findMangoes(int[][] arr, int row, int col,int[][] ar) {
        if(row >= arr.length || col>=arr[0].length) {
            return Integer.MIN_VALUE;
        }
        if(ar[row][col] != 0) return ar[row][col];
        if(row==arr.length-1 && col == arr[0].length-1) {
            return arr[row][col];
        }
        int down = findMangoes(arr,row+1,col,ar);
        int right = findMangoes(arr,row,col+1,ar);
        ar[row][col] = Math.max(down,right) + arr[row][col];
        return ar[row][col];
    }
}
