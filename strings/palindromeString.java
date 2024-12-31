package strings;

public class palindromeString {
    public static void main(String[] args) {
        String str="racecar";
        boolean bool=true;
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if (str.charAt(i)!=str.charAt(n-1-i)) {
                System.out.println("Not a palindrome number");
                bool=false;
                break;
            }
        }
        if (bool!=false) {
            System.out.println("Palindrome number");
        }
    }
}
