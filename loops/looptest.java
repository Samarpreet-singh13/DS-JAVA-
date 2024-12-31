// inverted half pyramid with number patters
// import java.util.*;
// public class Test {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n =sc.nextInt();
//         // int count=n;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// printing 01 triangle 
// import java.util.*;
// public class Test {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number of terms:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if ((i+j)%2==0) {
//                     System.out.print(1);
//                 }
//                 else System.out.print(0);
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

// inverted and rotated half pyramid
// import java.util.*;
// public class Test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = n; j > i; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

// floyd's triangle
// public class Test {
//     public static void main(String[] args) {
//         int n =4;
//         int count=1;
//         for(int i =1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(count+" ");
//                 count++;
//             }
//             System.out.println();
//         }
//     }
// }

// butterfly pattern
// public class Test {
//     public static void main(String[] args) {
//         int n =4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=n-1;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=n;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=n-1;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=n;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// solid rhombus pattern
// public class Test {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 4; j > i; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("*");
//             }
//         System.out.println();    
//         }
//     }
// }

// hollow rhombus pattern
// public class Test {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 4; j > i; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < 5; j++) {
//                 if (j>0 && j<4 && i>0 && i<4) {
//                     System.out.print(" ");
//                 } else {
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// number pyramid pattern
// public class Test {
//     public static void main(String[] args) {
//         int count=1;
//         for (int i = 1; i <=5; i++) {
//             for (int j = 4; j >=i; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(count+" ");
//             }
//             count++;
//             System.out.println();
//         }
//     }
// }

// palandromic number pattern pyramid
// public class Test {
//     public static void main(String[] args) {
//         for (int i = 1; i <=5; i++) {
//             for (int j = 4; j >=i; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=i; j++) {
//                System.out.print(j); 
//             }
//             for (int j = 2; j < i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }    
// }
