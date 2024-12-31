package Tries;

public class StartsWith {
    static class Node{
        Node[]children=new Node[26];
        boolean eow=false;

        Node(){
            for (int i = 0; i < 26; i++) {
                children[i]=null;
            }
        }

    }
        public static Node root=new Node() ;

        public static void insert(String word){
            Node curr=root;

            for (int i = 0; i < word.length(); i++) {
                int idx=word.charAt(i)-'a';
                if (curr.children[idx]==null) {
                    curr.children[idx]=new Node();
                }
                curr=curr.children[idx];
            }
            curr.eow=true;
        }

        public static boolean prefix(String key){
            Node curr=root;
            for (int i = 0; i < key.length(); i++) {
                if (curr.children[key.charAt(i)-'a']==null) {
                    return false;
                }
                curr=curr.children[key.charAt(i)-'a'];
            }
            return true;
        }
        public static void main(String[] args) {
            String arr[]={"app","apple","man","mango","woman"};

            for (int i = 0; i < arr.length; i++) {
                insert(arr[i]);
            }

            System.out.println(prefix( "apm"));
        }
}
