public class prefixSAS {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int prefix[]=new int[arr.length];
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=arr[i]+prefix[i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                    curr_sum=i==0?prefix[i]:prefix[j]-prefix[i-1];
                    if (max_sum<curr_sum) {
                        max_sum=curr_sum;
                    }
            }
        }
        System.out.println("Max sum is "+max_sum);
    }
}
