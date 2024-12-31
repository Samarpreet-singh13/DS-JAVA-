package Recursion;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibbo(10));
    }
    public static int fibbo(int n ){
        if (n==0||n==1) {
            return n;
        }
        // we take two variables of smaller function which we believe will be done on it's own 
        int Fnm1=fibbo(n-1);
        int Fnm2=fibbo(n-2);
        int Fn=Fnm1+Fnm2;
        return Fn;
    }
}
