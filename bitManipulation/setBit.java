package bitManipulation;

public class setBit {
    public static void main(String[] args) {
        int n =10;
        int i =4;
        int bitmask=1<<i;
        System.out.println(n|bitmask);
    }
}
