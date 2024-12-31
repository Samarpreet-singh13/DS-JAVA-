package sorting_algorithms;

public class countingSort {
    public static void countSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        // finding the largest element to find the size of the frequency array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        // adding the element in the respective index and incrementing the value
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        // traversing the freq array to place it on the array back
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                // this line will convert the array sorted ascending order
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countSort(arr);
        print(arr);
    }
}
