package Stacks;
import java.util.*; 
public class NextGreater {
    public static void greater(int arr[],int[] greater){
        Stack<Integer> s=new Stack<>();
        
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty()&&arr[i]>=arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                greater[i]=-1;
            }else{
                greater[i]=arr[s.peek()];

            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int greater[]=new int[arr.length];

        greater(arr, greater);
        for (int i = 0; i < greater.length; i++) {
            System.out.println(greater[i]);
        }
    }
}
