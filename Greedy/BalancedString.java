package Greedy;
// import java.util.*;
public class BalancedString {
    public static int balance(String str ){
        int ans=0;
        if (str.length()==0){
            return 0;
        }
        int r=0;
        int l=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='r') {
                r++;
            }
            if (str.charAt(i)=='l') {
                l++;
            }
            if (r==l) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String  str="llrrrrllrl";
        System.out.println(balance(str));
    }
}
