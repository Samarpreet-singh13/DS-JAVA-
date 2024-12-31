// find repeated numbers
// public class testarray {
//     public static boolean repeated(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
//         System.out.println(repeated(arr));
//     }
// }

// binary search pivoted array
public class testarray {
    public static int PivotedSearch(int arr[],int key){
        int start=0;
        int end=arr.length;
        while (start<=end) {
            int mid =(start+end)/2;
            if (arr[mid]==key) {
                System.out.println("Found ");
                return mid;
            }
            if (arr[start]<=arr[mid]) {
                if (arr[start]<=key&&key<=arr[mid]) {
                    end=mid-1;
                }
                else
                start=mid+1;
            }else{
                if (arr[mid]<=key&&key<=arr[mid]) {
                    start=mid+1;
                }
                else
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int key = 0;
        System.out.println(PivotedSearch(arr,key));
    }
}