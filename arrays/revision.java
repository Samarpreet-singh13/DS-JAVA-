// // subarrays
// public class revision {
//     public static void main(String[] args) {
//         int arr[] = { 2, 5, 8, 3, 4, 9 };
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 for (int j2 = i; j2 <= j; j2++) {
//                     System.out.print(arr[j2] + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }

// trapped water problem
// public class revision {
//     public static int trapped_pani(int arr[]){
//         int left_max[]=new int[arr.length];
//         left_max[0]=arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             left_max[i]=Math.max(left_max[i-1], arr[i]);
//         }
//         int right_max[]=new int[arr.length];
//         right_max[arr.length-1]=arr[arr.length-1];
//         for (int i = arr.length-2; i >= 0; i--) {
//             right_max[i]=Math.max(right_max[i+1], arr[i]);            
//         }
//         int trapped=0;
//         for (int i = 0; i < right_max.length; i++) {
//             int water_level=Math.min(left_max[i], right_max[i]);
//             trapped=trapped+water_level-arr[i];
//         }
//         return trapped;
//     }
//     public static void main(String[] args) {
//         int arr[]={4,0,0,6,3,2,5};
//         System.err.println(trapped_pani(arr));
//     }
// }

// buy and sell stocks 
// public class revision {
//     public static int buysellstock(int arr[]){
//         int buyprice=Integer.MAX_VALUE;
//         int maxprofit=0;
//         for (int i = 0; i < arr.length; i++) {
//             if (buyprice<arr[i]) {
//                 int profit=arr[i]-buyprice;
//                 maxprofit=Math.max(maxprofit, profit);
//             }
//             else
//             buyprice=arr[i];
//         }
//         return maxprofit;
//     }
//     public static void main(String[] args) {
//         int arr[]={7,1,3,5,4,6};
//         System.out.println(buysellstock(arr));
//     }
// }

// triplet sum returnig zero (three sum)
// public class revision {
//     public static int triplet(int nums[]){
//         return -1;
//     }
//     public static void main(String[] args) {
//         int nums[]={-1, 0, 1, 2, -1, -4};
//         triplet(nums);
//     }    
// }

// two sum 
public class revision {
    public static void two_sum(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.print("found at:[" + i + "," + j + "]");
                }
            }
        }
        // return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 7, 11, 15 };
        int target = 9;
        two_sum(num, target);
    }
}