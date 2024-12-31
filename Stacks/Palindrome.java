package Stacks;

import java.util.*;

public class Palindrome {
    public class Node {
        char data;
        Node next;

        Node(char d) {
            data = d;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static Boolean ispalindrome(Node head) {
        Stack<Character> s = new Stack<>();
        if (head == null || head == tail) {
            return true;
        }
        boolean Palindrome = true;
        Node temp = head;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            char c = s.pop();
            if (temp.data != c) {
                Palindrome = false;
                break;
            }
            temp = temp.next;
        }
        return Palindrome;

    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        head = p.new Node('a');
        head.next = p.new Node('b');
        head.next.next = p.new Node('c');
        head.next.next.next = p.new Node('b');
        head.next.next.next.next = p.new Node('a');
        if (ispalindrome(head)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
