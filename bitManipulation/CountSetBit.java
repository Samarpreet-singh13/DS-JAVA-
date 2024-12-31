package bitManipulation;

public class CountSetBit {
    public static void SetBitcounter(int n){
        int bitmask=1;
        int count=0;
        while (n>0) {
            if ((n&bitmask)!=0) {
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        SetBitcounter(31);
    }
}
