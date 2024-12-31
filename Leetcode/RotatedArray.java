package Leetcode;
// no. 1752
public class RotatedArray {
    class Solution {
        public boolean check(int[] nums) {
            int n = nums.length;
            int count = 0;
    
            // Count the number of times the order breaks
            for (int i = 0; i < n; i++) {
                if (nums[i] > nums[(i + 1) % n]) {
                    count++;
                }
            }
    
            // There should be at most one point where the order breaks
            return count <= 1;
        }
    }
    
}
