package Tries;

import java.util.Arrays;

public class PrefixProblem {
    static class Node{
        Node children[]=new Node[26];
        int freq=1;
        boolean eow=false;

        Node(){
         Arrays.fill(children, null);
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;

        for (int i = 0; i < word.length(); i++) {
            if (curr.children[word.charAt(i)-'a']==null) {
                curr.children[word.charAt(i)-'a'] =new Node();
            }else{
                curr.children[word.charAt(i)-'a'].freq++;
            }
            curr=curr.children[word.charAt(i)-'a'];
        }
        curr.eow=true;
    }

    public static void findprefix(Node root,String ans){
        if (root==null) {
            return;
        }
        if (root.freq==1) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i]!=null) {
                findprefix(root.children[i], ans+(char)(i+'a'));
            }
        }

    }
    public static void main(String[] args) {
        String []arr={"dog","dove","duck","zebre"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        root.freq=-1;
        findprefix(root, "");
    }
}
