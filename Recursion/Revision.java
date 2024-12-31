package Recursion;

public class Revision {
    public static void main(String[] args) {
        // System.out.println(sumN(10));
        // decrease(10);
        // increase(10);
        // System.out.println(factorial(6));      
        // int arr[]={2,6,3,7,2,4,6,7,8};
        // System.out.println(lastoccurence(arr, arr.length-1, 7));
        // System.out.println(fibbonacci(6));
        // int arr[]={1,2,3,4,5};
        // System.out.println(sortchecker(arr, 0));
        System.out.println(xpowern(2, 10));
    }

    // sum of n natural numbers
    public static int sumN(int n){
        if (n==1) {
            return 1;
        }
        return n+sumN(n-1);
    }

    // print in decreasing order
    public static void decrease(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decrease(n-1);
    }

    // printing  in increasing order
    public static void increase(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        increase(n-1);
        System.out.println(n);
    }

    // factorial of first 10 number
    public static int factorial(int n ){
        if (n==0||n==1) {
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn=n*fnm1;
        return fn;
    }

    // finding the first occurence of any elements
    public static int firstoccurence(int arr[],int i, int key){
        if (i==arr.length) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return firstoccurence(arr, i+1, key);
        }

    // finding the last occurence of any elements
    public static int lastoccurence(int arr[],int i, int key){
        // i=arr.length;
        if (i==0) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return lastoccurence(arr, i-1, key);
    }

    // fibbonacci series
    public static int fibbonacci(int n){
        if (n==0||n==1) {
            return n;
        }
        int fibnm1=fibbonacci(n-1);
        int fibnm2=fibbonacci(n-2);
        int fibn=fibnm1+fibnm2;
        return fibn;
    }

    // checking if an array is sorted or not
    public static boolean sortchecker(int arr[],int i){
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return sortchecker(arr, i+1);
    }

    // finding the value of xpowern
    public static int xpowern(int x,int n){
        if (n==0) {
            return 1;
        }
        int fnm1=xpowern(x, n-1);
        int fn=x*fnm1;
        return fn;
    }

    // finding the tiling problem
}
