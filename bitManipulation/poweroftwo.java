package bitManipulation;

public class poweroftwo {
    public static void isPowerOfTwo(int n ){
        if ((n&(n-1))==0) {
            System.out.println("It is power of two");
        }else
        System.out.println("Not power of two");
    }
    public static void main(String[] args) {
        isPowerOfTwo(8);
        isPowerOfTwo(6);
        isPowerOfTwo(7);
        isPowerOfTwo(16);
        isPowerOfTwo(20);
    }
}
