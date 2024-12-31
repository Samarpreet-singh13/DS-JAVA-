package Stacks;
import java.util.*;
public class StackReverse {
    public static void bottompush(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top=s.pop();
        bottompush(s, data);
        s.push(top);
    }
    // public static void reverse(Stack<Integer> s){
    //     Stack <Integer> sr=new Stack<>();
    //     if (s.isEmpty()) {
    //         return;
    //     }
    //     while (!s.isEmpty()) {
    //         int curr=s.pop();
    //         bottompush(sr, curr);
    //     }
    //     while (!sr.isEmpty()) {
    //         s.push(sr.pop());
    //     }  
    // }
   
    // here is the recursive approach for the above code 
    public static void reverse(Stack<Integer> s){
            if (s.isEmpty()) {
                return;
            } 
            int top=s.pop();
            reverse(s);
            bottompush(s, top);
    } 
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);

        reverse(s);
        System.out.println(s);
    }
}
