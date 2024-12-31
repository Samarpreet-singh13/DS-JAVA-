import java.util.*;
public class Dlinearsearch {
    public static void main(String[] args) {
        int arr[]={45,43,56,87,34,76,94,79};
        Scanner sc=new Scanner(System.in);  
        int target=sc.nextInt();
    for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                System.out.println("Element found at "+i);
                break;
            }
            // else {System.out.println("Element is not in the array");}
        }
        System.out.println("Element not found");
        sc.close();
    }
}
