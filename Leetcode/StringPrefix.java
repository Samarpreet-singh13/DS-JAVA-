package Leetcode;

public class StringPrefix {
    public static String longestCommonPrefix(String[] strs){
        if (strs==null||strs.length==0) {
            return "";
        }

        StringBuilder sb=new StringBuilder("");
        int idx=0;
        while(true){
            if (idx>=strs[0].length()) {
                break;
            }
            Character curr=strs[0].charAt(idx);
            for (int i = 1; i < strs.length; i++) {
                if (idx>=strs[i].length()||strs[i].charAt(idx)!=curr) {
                    return sb.toString();
                }
            }
            sb.append(curr);
            idx++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String strs[] ={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
