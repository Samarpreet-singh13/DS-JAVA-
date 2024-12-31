package Stacks;
import java.util.*;
public class PushAtBottom {
        public static void bottompush(Stack<Integer> s, int data){
            if (s.isEmpty()) {
                s.push(data);
                return;
            }

            int top=s.pop();
            bottompush(s, data);
            s.push(top);
        }
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);

        bottompush(s,5);
        System.out.println(s);
    }
}
