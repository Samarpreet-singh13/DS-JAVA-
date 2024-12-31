package Recursion;

public class IncreaseNo {
    public static void main(String[] args) {
        int n=10;
        Increase(n);
    }

    public static void Increase(int n) {
        // it is the base condition
        if (n == 1) {
            System.out.println(n);
            return;
        }

        // here the function is calling itself untill the base condition arrives
        Increase(n - 1);
        System.out.println(n);
    }
}
