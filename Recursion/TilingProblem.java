package Recursion;

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
    public static int tiling(int n ){
        if (n==0||n==1) {
            return 1;
        }
        // time complexity of O(logn)
        int fnm1=tiling(n-1);
        int fnm2=tiling(n-2);
        int total=fnm1+fnm2;
        return total;
    }
}
