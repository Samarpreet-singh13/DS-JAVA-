package arrays2D;

public class SortedSearch {
    // public static int binarysearch(int arr[], int key) {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start <= end) {
    //         int mid = (start + end) / 2;
    //         if (arr[mid] == key) {
    //             // System.out.println("Key found at " + mid);
    //             return mid;
    //         } else if (arr[mid] < key) {
    //             start = mid + 1;
    //         } else if (arr[mid] > key) {
    //             end = mid - 1;
    //         }
    //     }
    //     // System.out.println("Key not found");
    //     return -1;
    // }
   
    public static void Search(int arr[][],int key){

        // it is the normal way and the uses brute force and the time complexity is O(n^2)  
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[i][j]==key) {
        //             System.out.print("Found at:"+"["+i+","+j+"]");
        //         }
        //     }
        // }
        
        // now the way of binary searcg is used row wise as the array is sorted 
        // for (int i = 0; i < arr.length; i++) {
        //     int mid= binarysearch(arr[i], key);
        //     // here if-else is used becoz when in an iteration key is not found -1 is returned and to resolve issue of wrong index mid!=-1 is used
        //     if (mid!=-1) {
        //         System.out.print("Found at:"+"["+i+","+mid+"]");
        //         break;
        //     }
        //     if (mid==-1) {
        //         System.out.println("Not found ");
        //     }
        // }
        
        // now using the method of staircase using the top right and bottom left cell
        int row=0;
        int col=arr[0].length-1;
        while (row<arr.length-1 && col>=0) {
            if (arr[row][col]==key) {
                System.out.print("found at:"+"["+row+","+col+"]");
                break;
            }
            else if (arr[row][col]>key) {
                col--;
            }
            else  {
                row++;
            }
        }

    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,32,39,50}};
        int key=29;
        Search(arr, key);
    }
}
