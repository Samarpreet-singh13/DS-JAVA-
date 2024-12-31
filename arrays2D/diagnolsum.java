package arrays2D;

public class diagnolsum {
    public static void sumDiagnol(int arr[][]){
        int diagnolsum=0;

        // the below algo uses 2 loop that means the time complexity is o(n^2)
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (i==j) {
        //             diagnolsum=diagnolsum+arr[i][j];
        //         }
        //         else if ((i+j==arr.length-1)&&i!=j) {
        //             diagnolsum=diagnolsum+arr[i][j];
        //         }
        //     }
        // }
        // System.out.println(diagnolsum);

        // the below code will show the time complexity of o(n) making it faster and more optimized
        for (int i = 0; i < arr.length; i++) {
            diagnolsum=diagnolsum+ arr[i][i];

            //  as done above i+j=n-1 is a condition and below we have found the value of j=n-1-i 
            if (i!=arr.length-i-1) {
                diagnolsum=diagnolsum+arr[i][arr.length-i-1];
            }
        }
        System.out.println(diagnolsum);
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
        sumDiagnol(arr);
    }
}
