package functionsjava;
// binary to decimal
// public class Cfunctest {
//     public static void convert(int n){
//         int decN=0;
//         int pow=0;
//         while(n>0){
//             int last_digit=n%10;
//             decN=decN + (last_digit* (int)Math.pow(2, pow));
//             pow++;
//             n=n/10;
//         }
//         System.out.println(decN);
//     }
//     public static void main(String[] args) {
//         convert(10101);
//     }
// }

// using for loop
// public class Cfunctest {
//     public static void convert(int n){
//         int decN=0;
//         // int pow=0;
//         for(int i=0;n>0;i++){
//             int last_digit=n%10;
//             decN=decN + (last_digit* (int)Math.pow(2, i));
//             // pow++;
//             n=n/10;
//         }
//         System.out.println(decN);
//     }
//     public static void main(String[] args) {
//         convert(101010);
//     }
// }

// decimal to binary
// public class Cfunctest {
//     public static void convert(int n) {
//         int pow=0;
//         int bin=0;
//         while (n>0) {
//             int rem=n%2;
//             bin=bin+(rem*(int)Math.pow(10, pow));
//             pow++;
//             n=n/2;
//         }
//         System.out.println(bin);
//     }
//     public static void main(String[] args) {
//         convert(2);
//     }
// }

// average of 3 num
// public class Cfunctest {
// public static void avrge(int a,int b,int c) {
//     int avrge=(a+b+c)/3;
//     System.out.println(avrge);
// }
//     public static void main(String[] args) {
//         avrge(44, 88, 77);
//     }
// }

// even test
// public class Cfunctest {
//     public static boolean isEven(int n) {
//         if (n%2==0) {
//             return true;
//         }
//         else return false;
//     }
//     public static void main(String[] args) {
//         System.out.println(isEven(56));
//     }
// }

// palindrome
// public class Cfunctest {
//     public static void palimdrome(int n){
//         int last_digit=0;
//         int og_num=n;// og_num is taken here because the value of n is updated in line 90
//         int pow=0;
//         int new_num=0;
//         while (n>0) {
//             last_digit=n%10;
//             new_num=new_num+(last_digit*(int)Math.pow(10, pow));
//             pow++;
//             n=n/10;
//         }
//         System.out.println(new_num);
//         if (new_num==og_num) {
//             System.out.println("It is a palindrome number");
//         }
//         else
//         System.out.println("It is not a palindrome number");
//     }
//     public static void main(String[] args) {
//         palimdrome(121);
//     }
// }

// sum of digits of a number
// public class Cfunctest {
//     public static void sumofdigits(int n){
//         int last_digit=0;
//         int sum=0;
//         while (n>0) {
//             last_digit=n%10;
//             sum=sum+last_digit;
//             n=n/10;
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         sumofdigits(12345);
//     }
// }

// math class of java and its methods
// public class Cfunctest    
// {    
//     public static void main(String[] args)     
//     {    
//         double x = 28;    
//         double y = 4;    
//         // return the maximum of two numbers  
//         System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
//         // return the square root of y   
//         System.out.println("Square root of y is: " + Math.sqrt(y));   
//         //returns 28 power of 4 i.e. 28*28*28*28    
//         System.out.println("Power of x and y is: " + Math.pow(x, y));      
//         // return the logarithm of given value       
//         System.out.println("Logarithm of x is: " + Math.log(x));   
//         System.out.println("Logarithm of y is: " + Math.log(y));  
//         // return the logarithm of given value when base is 10      
//         System.out.println("log10 of x is: " + Math.log10(x));   
//         System.out.println("log10 of y is: " + Math.log10(y));    
//         // return the log of x + 1  
//         System.out.println("log1p of x is: " +Math.log1p(x));    
//         // return a power of 2    
//         System.out.println("exp of a is: " +Math.exp(x));    
//         // return (a power of 2)-1  
//         System.out.println("expm1 of a is: " +Math.expm1(x));  
//         System.out.println("expm1 of a is: " +Math.expm1(x));  
//         System.out.println("expm1 of a is: " +Math.abs(x));  
//     }    
// }
