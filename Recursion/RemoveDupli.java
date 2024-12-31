package Recursion;

public class RemoveDupli {
    public static void main(String[] args) {
        String str="samarpreet";
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void removeduplicates(String str, int idx,StringBuilder newStr,boolean map[]){
        if (idx==str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if (map[currChar-'a']==true) {
            removeduplicates(str, idx+1, newStr, map);          
        }else{
            map[currChar-'a']=true;
            removeduplicates(str, idx, newStr.append(currChar), map);
        }
    }
}