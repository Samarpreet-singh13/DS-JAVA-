import java.util.*;
public class Aifelse2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the salary of the person ");
        int sal=sc.nextInt();
        if (sal<500000) {
            System.out.println("No tax will be collected");
        }
        else if (sal>500000 && sal<750000) {
            System.out.println("tax will be "+(sal*0.1 + sal));
        }
          else if (sal>750000 && sal<1000000) {
            System.out.println("tax will be "+(sal*0.2 + sal));
        }
          else if (sal>1000000) {
            System.out.println("tax will be "+(sal*0.3 + sal));
        }
        sc.close();
    }
}
