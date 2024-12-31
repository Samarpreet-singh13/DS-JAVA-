package loops;
import java.util.*;
public class reverseorg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // int n = 123456789;
        System.out.print("Enter the number ");
        int n=sc.nextInt();
        int rev =0;
        while (n>0) {
            int last_digit=n%10;
            rev=rev*10+last_digit;
            n=n/10;
        }
        System.out.println(rev);
        sc.close();
    }
}
