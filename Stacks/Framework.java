package Stacks;
import java.util.*;
public class Framework {
   public static void main(String[] args) {
    Stack<Integer> s= new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    System.out.println(s);
    System.out.println(s.peek());

    s.pop();
    System.out.println(s);
    System.out.println(s.peek());

    while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
    }
   }

}
