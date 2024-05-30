public class trappingwater {
    public static int trapped(int height[]) {
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        // finding the left max by traversing the array from left 
        for (int i = 1; i < n; i++) {
            leftmax[i]=Math.max(leftmax[i-1], height[i]);
        }
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        // finding the right max by traversing the array from right 
        for (int i = n-2; i >= 0; i--) {
            rightmax[i]=Math.max(rightmax[i+1], height[i]);
        }
        int trapped_pani=0;
        for (int i = 0; i < n; i++) {
            int water_level=Math.min(leftmax[i], rightmax[i]);
            trapped_pani=trapped_pani+water_level-height[i];
        }
        return trapped_pani;
    }
    public static void main(String[] args) {
        int height[]={4,0,0,6,3,2,5};
        System.out.println(trapped(height));
    }
}
