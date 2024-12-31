package Recursion;

public class DescNo {
    public static void main(String[] args) {
        int n =10;
        decreasingNo(n);
    }

    public static void decreasingNo(int n){
        // it is the base condition
        if (n==1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        // here the function is calling itself untill the base condition arrives
        decreasingNo(n-1);
    }
}
