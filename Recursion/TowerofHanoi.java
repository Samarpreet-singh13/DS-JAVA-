package Recursion;

public class TowerofHanoi {
    public static void main(String[] args) {
        hanoitower(4, "A", "B", "C");
    }

    public static void hanoitower(int n, String src, String helper, String dest) {
        if (n==1) {
            System.out.println("Ring "+n +" transferred from "+src +" to "+dest);
            return;
        }
        hanoitower(n-1, src, dest, helper);
        System.out.println("Ring "+n +" transferred from "+src +" to "+dest);
        hanoitower(n-1, helper, src, dest);
    }
}
