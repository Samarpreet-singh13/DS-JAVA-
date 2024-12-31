package Hashing;
import java.util.*;
public class HashmapIntro {
    public static void main(String[]args){
        HashMap<String,Integer>hm=new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);

        System.out.println(hm);

        hm.remove("USA");

        System.out.println(hm.get("India"));

        System.out.println(hm);

        System.out.println(hm.containsKey("indonesia"));

        System.out.println(hm.size());

        hm.clear();

        System.out.println(hm.isEmpty());
    }
}
