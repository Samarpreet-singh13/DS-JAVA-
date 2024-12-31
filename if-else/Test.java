// armstrong
import java.util.*;
import java.lang.Math;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int n=sc.nextInt();
        System.out.print("Enter the number of digits ");
        int y=sc.nextInt();
        int og=n;
        int arm=0;
        while (n>0) {
            int last_digit=n%10;
            arm=arm +(int) Math.pow(last_digit, y);
            n=n/10;
        }
        System.out.println(arm);
        if (arm==og) {
            System.out.println("Its an armstrong number");
        }
        else System.out.println("Not an armstrong number");
        sc.close();
    }
}

// continue
// import java.util.*;
// public class Test {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         do{
//             System.out.print("Enter your number");
//             int n=sc.nextInt();
//             if (n%10==0) {
//                 continue;
//             }
//             System.out.println(n);
//         }while(true);
//     }
// }

// prime
// import java.util.*;
// import java.lang.Math;
// public class Test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number");
//         int n = sc.nextInt();
//         if (n == 2) {
//             System.out.println("It is a prime number");
//         } else {
//             for (int i = 2; i <= Math.sqrt(n); i++) {
//                 if (n % i == 0) {
//                     System.out.println("Not a prime number");
//                 } else
//                     System.out.println("It is a prime number");
//             }
//         }
//         sc.close();
//     }
// }
