package Leetcode;
// number 286
public class MissingNo {
    public int missingNumber(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int count[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(i<=nums.length){
                count[nums[i]]++;
            }
        }
        for(int t=0;t<=nums.length;t++){
            if(count[t]==0){
                return t;
            }
        }
        return 0;
    }
}
