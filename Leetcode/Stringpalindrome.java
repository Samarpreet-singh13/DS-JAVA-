package Leetcode;

public class Stringpalindrome {
    public static boolean palindrome(String s){
        int n=s.length();
        for (int i = 0; i < n/2; i++) {
            if ((s.charAt(i)<'a'&&s.charAt(i)>'z')||(s.charAt(i)>'0'&&s.charAt(i)>'9')) {
                continue;
            }
            if ((s.charAt(i) != s.charAt(n - 1 - i)) && !(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="race a car";
        String s=str.toLowerCase();
        System.out.println(palindrome(s));
    }
}
