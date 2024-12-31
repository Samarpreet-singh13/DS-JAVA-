public class Dlargestinarr {
    public static int largest(int arr[]) {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest<arr[i]) {
                largest=arr[i];
            }
            if (smallest>arr[i]) {
                smallest=arr[i];
            }
        }
        System.out.println("The smallest number is "+smallest);
        return largest;
    }
public static void main(String[] args) {
    int arr[]={23,45,3,2,56,23346,53,0};
    System.out.println("The largest number is "+largest(arr));
}
    
}
