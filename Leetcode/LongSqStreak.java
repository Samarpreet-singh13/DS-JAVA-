package Leetcode;

import java.util.*;
// leetcode 2501
public class LongSqStreak {
    public int longestSquareStreak(int[] nums) {
        int max=-1;

        Arrays.sort(nums);

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            int root=(int)Math.sqrt(i);

            if(root*root==i&&map.containsKey(root)){
                map.put(i,map.get(root)+1);
                max=Math.max(map.get(i),max);
            }else{
                map.put(i,1);
            }
        }
            return max;
    }
}
