package functionsjava;
public class binomial {
    public static int factorial(int n){
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*(i);
        }
        return fact;
    }
    public static int BC(int n, int r){
        int N=factorial(n);
        int R=factorial(r);
        int NMR=factorial(n-r);
        int BC=N/(R*NMR);
        return BC;
    }
    public static void main(String[] args) {
        System.out.println("Binomial coefficient is "+BC(5, 2));
    }
}