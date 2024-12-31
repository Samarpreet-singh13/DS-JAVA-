package Leetcode;
// leetcode 80
public class ArraySort2 {
    public static int removeDuplicates(int[] nums) {
        int i =0;
        int j =1;
        int count=1;
        int k=1;
        while( i<nums.length-1&&j<nums.length){
         if(nums[i]==nums[j]){
             count++;
         }else{
             count=1;
         }
         if (count <= 2) {
                 nums[k] = nums[j];
                 k++; 
             }
         i++;
         j++;
        }
        return k;
     }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3};
        System.out.println(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[5]);
        System.out.println(removeDuplicates(arr));
    }
}
