public class maxSAS1 {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,-10};
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                curr_sum = 0; // Reset curr_sum to 0 for each subarray
                for (int j2 = i; j2 <= j; j2++) {
                    curr_sum = curr_sum + arr[j2];
                    if (max_sum < curr_sum) {
                        max_sum = curr_sum;
                    }
                }
                System.out.println(curr_sum); 
            }
        }
        System.out.println("The max sum from all arrays is: " + max_sum);
    }
}
