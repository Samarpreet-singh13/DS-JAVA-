package functionsjava;

import java.util.*;
public class swap {
    public static void swap1(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap1(a, b);
        // java only have call by value therefore the swap happening will be left in the function
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        sc.close();
    }
}
