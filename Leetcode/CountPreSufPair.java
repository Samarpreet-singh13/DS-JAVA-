package Leetcode;
// leetcode 3042
public class CountPreSufPair {
    class Solution {
        public int countPrefixSuffixPairs(String[] words) {
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                int j = i + 1;
                if (j < words.length) {
                    if (isPrefixandSufix(words[i], words[j])) {
                        count++;
                    }
                }
                j++;
            }
            return count;
        }
    
        public static boolean isPrefixandSufix(String s1, String s2) {
            if(s1.length()>s2.length()){
                return false;
            }
            int i = 0;
            while (i < s1.length()) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
                i++;
            }
            i = s1.length()-1;
            int j = s2.length()-1;
    
            while (i >= 0){
                if (s1.charAt(i) != s2.charAt(j)) {
                    return false;
                }
                j--;i--;
            }
            return true;
        }
    }
}
