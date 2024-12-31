package strings;
import java.util.*;
public class introduction {
    public static void main(String[] args) {
        String str="samar";
        System.out.println(str);

        String str2=new String("preet");
        System.out.println(str2);

        Scanner sc= new Scanner(System.in);
        
        // it will print only one word
        String str3=sc.next();
        System.out.println(str3);
        
        // it will print the whole line or multiple lines 
        String sting=sc.nextLine();
        System.out.println(sting);

        sc.close();
    }
}
