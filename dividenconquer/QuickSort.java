package dividenconquer;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        print(arr);
        System.out.println();

        quicksort(arr, 0, arr.length-1);
        print(arr);
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // code below to find the index of pivot
        int pidx = partition(arr, si, ei);

        // after pivot is foun below funcs are called as the left and right from pivot
        // are smaller and larger resp

        quicksort(arr, si, pidx - 1); // left
        quicksort(arr, pidx + 1, ei); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int i = si-1;
        int pivot = arr[ei];

        // here for loop is used to traverse the array from start and i is used to keep
        // in track of the places where swap is done and to have the final value of
        // pivot index
        for (int k = si; k < ei; k++) {
            if (arr[k] < pivot) {
                i++;

                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
            i++;
            int temp = pivot;
            arr[ei] = arr[i];
            arr[i] = temp;
            
        return i;
    }
}
