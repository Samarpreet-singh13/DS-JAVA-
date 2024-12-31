package Leetcode;
// no. 3152;
class SpecialArray2 {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];

        // if (nums.length == 1) {
        //     ans[0] = true;
        // }

        if (nums.length == 1) {
        for (int i = 0; i < queries.length; i++) {
            ans[i] = true;
        }
        return ans;
        }

        for (int i = 0; i < queries.length; i++) {
            boolean isSpecial = true;
            for (int j = queries[i][0]; j < queries[i][1]; j++) {
                if (j + 1 >= nums.length) break;
                if ((nums[j]%2==0&&nums[j+1]%2==0)||(nums[j]%2!=0&&nums[j+1]%2!=0)) {
                    isSpecial = false;
                    break;
                } else {
                    isSpecial = true;
                }
            }
            ans[i] = isSpecial;
        }

        return ans;
    }
}