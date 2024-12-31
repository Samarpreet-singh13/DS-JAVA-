package Leetcode;
// no 2938;
public class SeparateBalls {
    public static long minimumsteps(String s){
        long ones=0;
        long ans=0;

        for(char c:s.toCharArray()){
            if (c=='1') {
                ones++;
            }else{
                ans+=ones;
            }
        }
        return ans;
    }
}
