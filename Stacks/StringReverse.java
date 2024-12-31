package Stacks;
import java.util.*;
public class StringReverse {
    public static String reverse(String str){
        Stack<Character> s= new Stack<>();
        int idx=0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder str2=new StringBuilder("");
        while (!s.isEmpty()) {
            char curr=s.pop();
            str2.append(curr);
        }

        return str2.toString();
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(str);
        String result=reverse(str);
        System.out.println(result);
    }
}
