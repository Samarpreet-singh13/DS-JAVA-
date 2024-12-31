public class Darrays2ref {
    public static void refrence(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+100;
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[]={100,200,300,400,55};
        refrence(arr);
    }
}
