package strings;

public class shortestPath {
    public static float getpath(String str){
        int x=0;
        int y=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='S') {
                y--;
            }  
            else if (str.charAt(i)=='E') {
                y++;
            }  
            else if (str.charAt(i)=='W') {
                x--;
            }  
            else {
                x++;
            }
        }
        int X=x*x;
        int Y=y*y;
        return (float)Math.sqrt(X+Y);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getpath(path));
    }
}
