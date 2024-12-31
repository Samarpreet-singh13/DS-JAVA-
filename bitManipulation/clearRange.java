package bitManipulation;

public class clearRange {
    public static void clearRangeofit(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        System.out.println(n&bitmask);
    }
    public static void main(String[] args) {
        clearRangeofit(10, 2, 4);
    }
}
