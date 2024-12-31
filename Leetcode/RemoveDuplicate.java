package Leetcode;
// number 26
public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) 
        return 0;

        int i = 0;  // Pointer for the last unique element
        int j = 1;  // Pointer to iterate through the array

        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                // Found a duplicate, increment j to skip it
                j++;
            } else {
                // Found a unique element
                i++;
                nums[i] = nums[j];
                j++;
            }
        }

        // The length of the array with unique elements is i + 1
        return i + 1;
    }
}
