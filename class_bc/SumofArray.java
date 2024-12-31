package class_bc;

public class SumofArray {
    public static void main(String[] args) {
        int arr[]={1,5,6,7,5,33,4};
        int max=-1;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max, arr[i]);
            min=Math.min(min, arr[i]);
        }
        System.out.println(max);
        System.out.println(min);
    }    
}
