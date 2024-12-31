package Hashing;
import java.util.*;
public class SortByFreq {
    public static String sort(String str){
        HashMap<Character,Integer>freq=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            freq.put(str.charAt(i),freq.getOrDefault(str.charAt(i), 0)+1);
        }
        List<Map.Entry<Character,Integer>>list=new ArrayList<>(freq.entrySet());

        list.sort((entry1,entry2)->entry2.getValue().compareTo(entry1.getValue()));

        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> key:list){
            char c=key.getKey();
            int frequency=key.getValue();
            for (int i = 0; i < frequency; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="tree";
        String result=sort(str);
        System.out.println(result);
    }
}
