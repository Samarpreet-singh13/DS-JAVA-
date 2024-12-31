package Recursion;

public class LastOccur {
    public static void main(String[] args) {
        int arr[]={2,6,3,7,2,4,6,7,8};
        System.out.println(lastOccur(arr, arr.length-1, 2));
    }
    public static int lastOccur(int arr[],int i , int key){
        if (i==-1) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return lastOccur(arr,i-1,key);
    }
}
