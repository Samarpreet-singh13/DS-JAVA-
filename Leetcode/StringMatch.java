package Leetcode;

import java.util.ArrayList;
import java.util.List;

// 1408
public class StringMatch {
    class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String st=words[i];
            for(int j=0;j<words.length;j++){
                String subst=words[j];
                if(!st.equals(subst)){
                    if(st.contains(subst)){
                        if(!ans.contains(subst)){
                            ans.add(subst);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
}
