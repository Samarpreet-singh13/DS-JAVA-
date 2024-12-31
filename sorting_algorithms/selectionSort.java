package sorting_algorithms;
public class selectionSort {
    public static void main(String[] args) {
        int arr[]={5,8,2,4,0,7};
        for (int i = 0; i < arr.length-1; i++) {
            //setting the minimum value as the current turn
            int minval=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minval]>arr[j]) {
                    //if we see that the number is more than the current then value is changed  
                    minval=j;
                }
            }
            //swap
            int temp=arr[minval];
            arr[minval]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
 
    
}