package Recursion;

public class XpowerN {
    public static void main(String[] args) {
        System.out.println(xtimesN(2, 10));
    }
    public static int xtimesN(int x,int n){
        if (n==0) {
            return 1;
        }
        // int xnm1=xtimesN(x, n-1);
        // int xn=x*xnm1;
        return x*xtimesN(x, n-1);
    }
}