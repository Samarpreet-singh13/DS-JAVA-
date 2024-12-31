package loops;
// below program contains loops of normal and reverse half pyramid and charcter printing using count
import java.util.*;
public class star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms (stars) printed: ");
        int n=sc.nextInt();
        // int count=1;
        // int count='A';

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                // count++;
            }
            // count++;
            System.out.println();
        }
        sc.close();
    }
}
