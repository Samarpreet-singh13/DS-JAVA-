package sorting_algorithms;
// import java.util.Arrays;
// import java.util.*;
public class inbuiltSort {
    public static void main(String[] args) {
        // int arr[]={5,1,2,4,3};

        Integer arr[]={5,1,2,4,3};
        // sort the whole array in ascending order
        // Arrays.sort(arr);

        // sort the array in the given index index of last is written one 
        // Arrays.sort(arr,0,3);

        // it will print in reverse sort order;
        // Arrays.sort(arr,Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
