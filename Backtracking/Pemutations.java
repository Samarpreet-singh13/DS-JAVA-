package Backtracking;

public class Pemutations {
    public static void main(String[] args) {
        String str="abc";
        findpermutations(str, "");
    }

    // page 1
    public static void findpermutations(String str,String ans){
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        for (int j = 0; j < str.length(); j++) {
            String newStr=str.substring(0,j)+str.substring(j+1);
            findpermutations(newStr, ans+str.charAt(j));
        }
    }
}
