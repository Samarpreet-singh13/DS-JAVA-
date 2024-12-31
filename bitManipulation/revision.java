package bitManipulation;

// get
// public class revision {
//     public static void main(String[] args) {
//         int n = 10;
//         int i = 1;
//         int bitmask = 1<<i;
//         if ((n&bitmask)==0) {
//             System.out.println(0);
//         }else System.out.println(1);
//     }
// }

// set 
// public class revision {
//     public static void main(String[] args) {
//         int n = 10;
//         int i = 2;
//         int bitmask = 1<<i;
//         System.out.println(n|bitmask);
//     }   
// }

// clear
// public class revision {
//     public static void main(String[] args) {
//         int n = 10;
//         int i = 1;
//         int bitmask = ~(1<<i);
//         System.out.println(n&bitmask);
//     }
// }

// odd-even 
// public class revision {
//     public static void oddeven(int n ){
//         int bitmask=1;
//         if ((n&bitmask)==0) {
//             System.out.println("EVEN");
//         }else System.out.println("ODD");
//     }
//     public static void main(String[] args) {
//         oddeven(6);
//         oddeven(7);
//     }
// }

// alternate power of two program
// public class revision {
//     public static void isPowerOfTwo(int n){
//         int bitmask=1;
//         int count=0;
//         while (n>0) {
//             if ((n&bitmask)!=0) {
//                 count++;
//             }
//             n=n>>1;
//         }
//         if (count==1) {
//             System.out.println("power of 2");
//         }else System.out.println("Not power of two");
//     }
//     public static void main(String[] args) {
//         isPowerOfTwo(7);
//         isPowerOfTwo(8);
//         isPowerOfTwo(16);
//         isPowerOfTwo(15);
//         isPowerOfTwo(32);
//     }
// }

