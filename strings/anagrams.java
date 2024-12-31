package strings;

import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1="care";
        String str2="race";

        if (str1.length()==str2.length()) {
            char[] ch1=str1.toCharArray();
            char[] ch2=str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2)) {
                System.out.print("They are anagrams");
            }
            else System.out.println("They are not anagrams");
        }
        else System.out.println("They are not anagrams");
    }
}
