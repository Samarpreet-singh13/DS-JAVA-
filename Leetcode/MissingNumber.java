package Leetcode;

import java.util.*;

public class MissingNumber {
    public static Stack<Integer> missingNumber(int arr1[], int arr2[]) {
        Stack<Integer> s = new Stack<>();
        int i = 0;
        int j=0;
        while (i < arr2.length&&j<arr2.length) {
            if (arr1[i]!=arr2[j]) {
                s.push(arr2[j]);
                j++;
            }else{
                j++;
                i++;
            }
        }
        while (j<arr2.length) {
            s.push(arr2[j]);
            j++;
        }
        return s;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 2, 5, 6 };
        int arr[] = { 7, 2, 5, 3, 4, 6 };
        System.out.println(missingNumber(arr1, arr));
    }
}
