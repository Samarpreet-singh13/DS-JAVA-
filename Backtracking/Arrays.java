package Backtracking;

public class Arrays {
    public static void main(String[] args) {
        int arr[]=new int[5];
        backtracking_arr(arr, 0,1);
        System.out.println();
        print(arr);
    }

    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void backtracking_arr(int arr[],int i,int val){
        if (i==arr.length) {
            print(arr);
            return;
        }
        arr[i]=val;
        backtracking_arr(arr, i+1,val+1); //till here the array will be 1 2 3 4 5 as call stack is normally called and when the below line is run then the backtracking is taking place and hence the value of array becomes -1 0 1 2 3
        arr[i]=arr[i]-2;
    }
}
