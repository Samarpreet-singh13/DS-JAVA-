package Hashing;
import java.util.*;
public class Sets {
    public static void main(String[] args) {
        // normal set displayes data in unordered random form 
        HashSet<String>set=new HashSet<>();
        // add operation for the set
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        // printing a set
        System.out.println(set);
        set.remove("one");
        System.out.println(set);
        set.clear();//emptying the set

        // displays the data in the order it it entered
        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("four");
        lhs.add("two");
        lhs.add("three");
        System.out.println(lhs);

        // displays in ascending order
        TreeSet<String>ts=new TreeSet<>();
        ts.add("two");
        ts.add("four");
        ts.add("three");
        System.out.println(ts);
    }
}
