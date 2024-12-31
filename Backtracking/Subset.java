package Backtracking;

public class Subset {
    public static void main(String[] args) {
        String str="abc";
        findsubset(str, "", 0);
    }

    public static void findsubset(String str,String ans,int i){
        if (i==str.length()) {
            if (ans.length()==0) {
                System.out.println("null");
            }
            else{
                System.out.println(ans);
                } 
            return;  
        }
        
        // when yes is choosen or the character is taken in the subset
        findsubset(str, ans+str.charAt(i), i+1);

        // when no is choosen or the character will not be added in the subset
        findsubset(str, ans, i+1);
    }
}
