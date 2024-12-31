package Recursion;

public class Friendspairing {
    public static void main(String[] args) {
        System.out.println(friendspairing(5));
    }
    public static int friendspairing(int n){
        if (n==0||n==1) {
            return n;
        }
        // choice - single or pair 
        // for single -> f(n-1) is called and it will provide the values when no pair is done meaning that everyone is standing single
        int fnm1=friendspairing(n-1);
        
        // for pairing-> (n-1)*f(n-2) is called, here n-1 is used as the choices left for the pairing like A can pair with B,C,D and E and is multiplied by f(n-2) n-2 is done here as when pairing is done left members are n-2
        int fnm2=friendspairing(n-2);
        int pairing_options=(n-1)*fnm2;

        // it will return the total ways in which friends could be paired
        return fnm1+pairing_options;
    }
}
