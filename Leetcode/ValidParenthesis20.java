package Leetcode;

import java.util.*;

public class ValidParenthesis20 {
    public static boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
             char curr=s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                st.push(curr);  
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if ((curr == ')' && top != '(') ||
                    (curr == '}' && top != '{') ||
                    (curr == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "([)]";
        System.out.println(isValid(str));
    }
}
