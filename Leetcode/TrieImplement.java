package Leetcode;
// leetcode 208
import java.util.*;
public class TrieImplement {
    TrieImplement obj[] = new TrieImplement[26];
    boolean eow = false;

    public TrieImplement() {
        Arrays.fill(obj, null);
    }

    public static TrieImplement root = new TrieImplement();

    public void insert(String word) {
        TrieImplement curr = this;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.obj[idx] == null) {
                curr.obj[idx] = new TrieImplement();
            }
            curr = curr.obj[idx];
        }
        curr.eow = true;
    }

    public boolean search(String word) {
        TrieImplement curr = this;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.obj[idx] == null) {
                return false;
            }
            curr = curr.obj[idx];
        }
        return curr.eow == true;
    }

    public boolean startsWith(String prefix) {
        TrieImplement curr = this;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.obj[idx] == null) {
                return false;
            }
            curr = curr.obj[idx];
        }
        return true;
    }
    
}
