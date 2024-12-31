package Recursion;

public class XpowerNoptimized {
    public static void main(String[] args) {
        System.out.println(XpowerN(2,5));
    }
    public static int XpowerN(int x,int n ){
        if (n==0||n==1) {
            return n;
        }
        // here the time complexity is O(n)
        // int halfpower=XpowerN(x, n/2)*XpowerN(x, n/2);
        
        // if we store the function XpowerN in a variable we will have to call it less times compared to before  
        int halffun=XpowerN(x, n/2);
        int halfpower=halffun*halffun;
        if (n%2!=0) {
            halfpower=x*halfpower;
        }
        return halfpower;
    }
}
