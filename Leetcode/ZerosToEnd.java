package Leetcode;
// number 283
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        while (i < nums.length) {
            if (j >= nums.length) {
                return;
            }

            if (nums[i] == 0 && nums[j] != 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else if (nums[j] == 0) {
                j++;
            } else {
                i++;
                if (i <= j) {
                    j = i + 1;
                }
            }
        }
    }


    public void swap(int nums[], int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}