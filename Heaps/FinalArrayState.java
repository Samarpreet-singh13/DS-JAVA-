package Heaps;
// leetcode 3264
public class FinalArrayState {
   
        public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int minidx=0;
            for(int j=1;j<nums.length;j++){
                if(nums[j]<nums[minidx]){
                    minidx=j;
                }
            }
            nums[minidx]=nums[minidx]*multiplier;
        }
        return nums;
        }
    }
