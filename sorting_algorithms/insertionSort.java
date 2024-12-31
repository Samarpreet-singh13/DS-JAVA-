package sorting_algorithms;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j]<arr[j-1]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        }
    // public static void main(String[] args) {
    //     int arr[]={5,8,2,4,0,7};
    //     for (int i = 1; i < arr.length; i++) {
    //         int curr=arr[i];
    //         int prev=i-1;
    //         // backtracking the array to find the small in each iteration
    //         while (prev>=0 && arr[prev]>curr) {
    //             arr[prev+1 ]=arr[prev];
    //             prev--;
    //         }
    //         // swapping of elemnet will be done 
    //         arr[prev+1]=curr;
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
}
