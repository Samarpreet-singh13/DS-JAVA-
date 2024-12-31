package Leetcode;
// no 179
import java.util.Arrays;
public class LargestNo {

    public class Solution {
        public String largestNumber(int[] nums) {
            // Step 1: Convert the numbers to strings
            String[] numStrs = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                numStrs[i] = String.valueOf(nums[i]);
            }
    
            // Step 2: Sort the array based on concatenation of strings (custom comparator)
            Arrays.sort(numStrs, (a, b) -> (b + a).compareTo(a + b));
    
            // Step 3: Edge case - if the largest number is "0", return "0"
            if (numStrs[0].equals("0")) {
                return "0";
            }
    
            // Step 4: Build the final result string
            StringBuilder str = new StringBuilder();
            for (String num : numStrs) {
                str.append(num);
            }
    
            // Step 5: Return the result as a string
            return str.toString();
        }
    }
    
}
