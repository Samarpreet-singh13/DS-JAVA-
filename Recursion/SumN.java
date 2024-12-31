package Recursion;

public class SumN {
    public static void main(String[] args) {
        System.out.println(sumofnatural(10));
    }
    public static int sumofnatural(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n + sumofnatural(n - 1);
    }
}
