package Backtracking;
// page 3
public class Gridways {
    public static void main(String[] args) {
        int n=3;int m=3;
        System.out.println(countways(0, 0, n, m));
    }

    public static int countways(int i , int j,int n ,int m){
        if (i==n-1&&j==m-1) {
            return 1;
        }else if (i==n||j==m) {
            return 0;
        }
        int w1= countways(i+1, j, n, m);
        int w2= countways(i, j+1, n, m);

        return w1+w2;
    }
}