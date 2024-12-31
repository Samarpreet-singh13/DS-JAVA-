public class subarrays {
    public static void main(String[] args) {
        int arr[]={2,3,5,7,9,11};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2]+" ");
                }
                System.out.println();
            }
        }
    }
}
