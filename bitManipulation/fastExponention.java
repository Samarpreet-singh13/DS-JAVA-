package bitManipulation;

public class fastExponention {
    public static void Exponention(int a,int n){
        int ans=1;
        while (n>0) {
                if ((n&1)!=0) {
                    ans=ans*a;
                }
                a=a*a;
                n=n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Exponention(5, 3);
    }
}
