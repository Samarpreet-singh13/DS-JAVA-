package Leetcode;

// Leetcode 139

import java.util.HashMap;
import java.util.List;

public class WordBreak {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

    }
    private static HashMap<String, Boolean> memo = new HashMap<>();

    public static Node root = new Node();

    public static boolean search(String key) {
        Node curr = root;

        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean solver(String key) {
         if (key.length() == 0) return true;
        if (memo.containsKey(key)) return memo.get(key);

        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && solver(key.substring(i))) {
                memo.put(key, true);
                return true;
            }
        }
        memo.put(key, false);
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        root=new Node();
        for (String word : wordDict) {
            insert(word);
        }
        memo.clear();
        return solver(s);
    }
}
