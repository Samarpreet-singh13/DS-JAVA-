package Leetcode;
import java.util.*;
// no 1593  
public class MaxSubString {
    public int maxUniqueString(String s){
        HashSet<String>set=new HashSet<>();
        return splits(0,s,set);
    }
    public int splits(int start,String s,HashSet<String>set){
        if (start==s.length()) {
            return 0;
        }

        int max=0;

        for(int i =start+1;i<=s.length();i++){
            String sub=s.substring(start,i);

            if (!set.contains(sub)) {
                set.add(sub);
                int split=1+splits(i, s, set);
                max=Math.max(max,split);
                set.remove(sub);
            }
        }
        return max;
    }
}
