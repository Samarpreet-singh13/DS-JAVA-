package Stacks;

import java.util.*;

public class Validparen {

    public static boolean isvalid(String str){
        if (str.length()==0) {
            return true;
        }
        Stack<Character> s= new Stack<>();
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='[') {
            s.push(str.charAt(i));
        }else{
            if (s.isEmpty()) {
                return false;
            }
            if (s.peek()=='('&&str.charAt(i)==')'||s.peek()=='{'&&str.charAt(i)=='}'||s.peek()=='['&&str.charAt(i)==']') {
                s.pop();        
            }else{
                return false;
            }
        }
      }
      if (s.isEmpty()) {
        return true;
      }else{
        return false;
      }
    }

    public static void main(String[] args) {
        String str="({[]}())";
        System.out.println(isvalid(str));
    }
}
