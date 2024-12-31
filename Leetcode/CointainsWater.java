package Leetcode;

// question 11
public class CointainsWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxCapacity = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int capacity = minHeight * (right - left);
            maxCapacity = Math.max(maxCapacity, capacity);

            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxCapacity;
    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
