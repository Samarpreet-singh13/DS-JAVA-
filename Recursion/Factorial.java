package Recursion;

public class Factorial {
    public static void main(String[] args) {
        // System.out.println(Printfact(5));
        System.out.println(ALTfact(100));
    }

    public static int Printfact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Printfact(n - 1);
    }

    public static int ALTfact(int n){
        if (n==0||n==1) {
            return 1;
        }
        int fact = ALTfact(n-1);
        fact=n*ALTfact(n-1);
        return fact;
    }
}
