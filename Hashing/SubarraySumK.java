package Hashing;
import java.util.*;

public class SubarraySumK {
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0, 1);
        int k=-10;

        int ans=0;
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (map.containsKey(sum-k)) {
                ans+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        System.out.println(ans);
    }
}