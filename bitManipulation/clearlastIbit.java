package bitManipulation;

public class clearlastIbit {
    public static void clearLastIBit(int n, int i){
        int bitmask = (~0)<<i;
        System.out.println((n&bitmask));
    }
    public static void main(String[] args) {
        clearLastIBit(10, 2);
        clearLastIBit(20, 3);
    }
}
