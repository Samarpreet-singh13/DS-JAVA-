package functionsjava;
public class factorial {
    public static void factorial1(int n){
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*(i);
        }
        System.out.println("Factorial is:"+fact);
    }
    public static void main(String[] args) {
        factorial1(6);
        factorial1(8);
    }
}
