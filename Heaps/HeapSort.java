package Heaps;

public class HeapSort {
    // this heapify code is here to convert it into maxheap
    // if we want to sort the heap in descending order we have to convert the heap into minheap and vice versa
    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }
        if (maxIdx != i) {
            // swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void heapsort(int arr[]) {
        int n =arr.length;
        // step1- build heap
        // this step converts heap into maxheap 
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // swapping  the first index with the last and then heapify
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 3, 5 };

        heapsort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
