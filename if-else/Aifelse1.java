import java.util.*;
public class Aifelse1 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter value of first number ");
    int a=sc.nextInt();
    System.out.print("Enter the value of second number ");
    int b =sc.nextInt();
    if (a<b) {
        System.out.println("Second number is greatest");
    }
    else System.out.println("First number is greater");
    sc.close();
    }
}
