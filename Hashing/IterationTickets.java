package Hashing;
import java.util.*;
public class IterationTickets {
    public static String getstart(HashMap<String,String>tickets){
        HashMap<String,String>reverse=new HashMap<>();

        for (String key : tickets.keySet()) {
            reverse.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()) {
            if (!reverse.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();

        map.put("Chennai", "Bengaluru");
        map.put("mumb", "delhi");
        map.put("goa", "chennai");
        map.put("delhi", "goa");

        String start=getstart(map);
        System.out.print(start);
        while (map.containsKey(start)) {  // Continue while there's a next destination
        System.out.print(" -> " + map.get(start));
        start = map.get(start);  // Update start to the next destination
    }
    }
}
