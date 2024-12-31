package Recursion;

public class FirstOccur {
    public static void main(String[] args) {
        int arr[]={2,6,3,7,2,4,6,7,8};
        System.out.println(firstOccur(arr, 0, 7));
    }
    public static int firstOccur(int arr[],int i ,int key){
        if (i==arr.length) {
            return-1;
        }
        if (arr[i]==key) {
            return i;
        }
        return firstOccur(arr, i+1, key);
    }
}
