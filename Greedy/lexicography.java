package Greedy;

import java.util.*;
public class lexicography {

    public static char[] lexi(int n,int k){
        char[] arr=new char[n];
        Arrays.fill(arr, 'a');//filling all the indices with 'a'

        for (int i = n-1; i >= 0; i--) {
            // adjusting the value of k, k=k-4(first iteration) as 5 index has 'a' and we want to change at the index therefore first 4 will remain with 'a' and hence 73-4 is done to adjust the last index 
            k-=i;
            if (k>=0) {
                if (k>=26) {
                    arr[i]='z';
                    k-=26;
                }else{
                    arr[i]=(char)(k+97-1);//getting the value of the alphabet using ASCII value
                    k-=arr[i]-'a'+1;
                }
            }else{
                break;
            }
            k+=i;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(lexi(5, 73));
    }
}
