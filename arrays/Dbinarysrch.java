public class Dbinarysrch {
    public static void binarysearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println("Key found at " + mid);
                return;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            }
        }
        System.out.println("Key not found");
    }

    public static void main(String[] args) {
        int arr[] = { 21, 32, 34, 45, 56, 76, 89, 100 };
        int key = 56;
        binarysearch(arr, key);
    }
}
