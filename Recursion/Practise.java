package Recursion;

public class Practise {
    public static void main(String[] args) {
        int arr[]={3,2,4,6,5,2,7,2,2};
        if (occurences(arr, 0, 2)) {
            System.out.println(occurences(arr, 0, 2));
        }else{
            System.out.println("Not found");
        }
        // printletter(1023456789);
        // System.out.println(stringlen("my name is samar", 0));
    }

    // finding all the occurences of an element in any array
    public static boolean occurences(int arr[],int idx,int key){
        if (idx==arr.length) {
            return false;
        }
        if (arr[idx]==key) {
            System.out.print(idx+" ");
            return true;
        }
        occurences(arr, idx+1, key);
        return false;
    }

    // print the number as letters 1947-one nine four seven
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printletter(int n){
        if (n==0) {
            return;
        }
        printletter(n/10);
        int lastdigit=n%10;
        System.out.print(digits[lastdigit]+" ");
    }

    // finding length of a string
    public static int stringlen(String str,int idx){
        if (idx==str.length()) {
            return 0;
        }
        return 1+stringlen(str, idx+1);
    }

    // find contigious string abcab=a,b,c,abca,bcab
    // public static String couString(String str , int idx){
    //     if (str.length()==1) {
    //         return str;
    //     }
    //     String newstr="";
    //     couString(str, idx+1);
    // }

}
