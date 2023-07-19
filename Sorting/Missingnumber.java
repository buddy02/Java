package Sorting;

class Missingnumber {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 1, 0 };
        System.out.println(missingNumber(arr)); 
    }
    public static int missingNumber(int[] nums) {
        int temp,i=0,k=nums.length,ans=k;
        while(i<k) {
            if(nums[i] == k) {
                ans = i;
                i++;
            }
            else if(nums[i]!=nums[nums[i]]) {
                temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[temp] = temp;
            }
            else {
                i++;
            }
        }
        return ans;
    }
}