package bitManipulation;

public class oddeven {
    public static void evenodd(int n ){
        if ((n&1)==0) {
            System.out.println("It is an even number");
        }
        else System.out.println("It is an odd number");
    }
    public static void main(String[] args) {
        evenodd(4);
        evenodd(9);
    }
}
