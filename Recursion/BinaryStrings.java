package Recursion;

public class BinaryStrings {
    public static void main(String[] args) {
        binString("", 0, 4);
    }   
    public static void binString(String str,int lastplace,int n){
        if (n==0) {
            System.out.println(str);
            return;
        }
        // repeat from here untill n becomes zero after that it enters ---->| 
        binString(str+"0", 0, n-1);                         //    |
        if (lastplace==0) {                                           //    |
            binString(str+"1", 1, n-1);                     //<---| and then the cycle repeats
        }
    } 
}