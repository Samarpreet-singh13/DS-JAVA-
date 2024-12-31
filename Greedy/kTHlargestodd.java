package Greedy;

public class kTHlargestodd {
    // public static int kthodd(int range[],int k){
    //     int odd=0;
    //     for (int i = range[1]; i >= range[0]; i--) {
    //         if (i%2!=0) {
    //             odd++;
    //             if (odd==k) {
    //                 return i;
    //             }
    //         }
    //     }
    //     return -1;
    // }

    // An optimized code for the above problem 
    public static int kthodd(int range[],int k){
        if (k<=0) {
            return -1;
        }
        int l=range[0];
        int r=range[1];

        if ((r&1)>0) {//if r iis an odd number
            int count=(int)Math.ceil((r-l+1)/2.0);//math.ceil rounds off to closest whole no , this line finds the number of odd in the range 
            if (k>count) {
                return 0;
            }else{
                return (r-2*k+2);//this line returns with the value of the kth largest odd number 
            }
        }else{//if the r is not an odd number 
            int count=(r-l+1)/2;
            if (count<k) {
                return 0;
            }else{
                return (r-2*k+1);
            }
        }
    }


    public static void main(String[] args) {
        int range[]={-10,10};
        int k =8;
        System.out.println(kthodd(range, k));
    }
}
