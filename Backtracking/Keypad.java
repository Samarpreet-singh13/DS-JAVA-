package Backtracking;

public class Keypad {
    public static void main(String[] args) {
        countcombo("23", "");
    }

    public static void print(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static String STR[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void countcombo(String str,String ans){
        // String str3[]=new String[str1.length*str2.length];
        // if (i==str1.length||j==str2.length) {
        //     print(str3);
        //     return;
        // }
        // for (int k = 0; k < str3.length; k++) {
        //     str3[k]=str1[i]+str2[j];
        //     countcombo(str1, str2, i, j+1);
        // }

        if (str.length()==0) {
            print(ans);
            return;
        }

        String key=STR[str.charAt(0)-48];

        for (int i = 0; i < key.length(); i++) {
            countcombo(str.substring(1), ans+key.charAt(i));
        }
    }
}
