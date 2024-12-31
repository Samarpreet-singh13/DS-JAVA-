package functionsjava;
public class product {
    public static int product1(int a , int b) {
        int multipy=a*b;
        return multipy;
    }
    public static void main(String[] args) {
        int prod=product1(10, 20);
        System.out.println(prod);
        prod= product1(100, 30);
        System.out.println(prod);
    }
}
