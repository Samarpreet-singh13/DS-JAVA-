package Leetcode;
// no 67
public class BinarySum {
    public String addBinary(String a, String b) {
        int carry =0;
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder str=new StringBuilder();
        while(i>=0||j>=0||carry>0){
            int sum=carry;

            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }

            str.append(sum%2);
            carry=sum/2;
        }
        return str.reverse().toString();
    }
}
