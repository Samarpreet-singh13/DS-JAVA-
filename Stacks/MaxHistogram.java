package Stacks;
import java.util.*;
public class MaxHistogram {
    public static void smallerRight(int arr[],int[] smallerR){
        Stack<Integer> s=new Stack<>();
        
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty()&&arr[i]<=arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                smallerR[i]=arr.length;//array.length is used to make the -1 value as the value of size of the array as the index can't be negative of the j
            }else{
                smallerR[i]=s.peek();

            }
            s.push(i);
        }
    }
    public static void smallerLeft(int arr[],int[] smallerL){
        Stack<Integer> s=new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty()&&arr[i]<=arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                smallerL[i]=-1;
            }else{
                smallerL[i]=s.peek();//here the s.peek is used instead of arr[s.peek] bcoz we need to store the index of the array only not the value in that

            }
            s.push(i);
        }

    }
    public static int maxArea(int arr[]){
        int arrL[]=new int[arr.length];
        smallerLeft(arr, arrL);
        int arrR[]=new int[arr.length];
        smallerRight(arr, arrR);
        int maxarea=-1;
        for (int i = 0; i < arr.length; i++) {
            int width=arrR[i]-arrL[i]-1;
            int area=width*arr[i]; 
            maxarea=Math.max(area, maxarea);
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        System.out.println(maxArea(arr));
    }
}
