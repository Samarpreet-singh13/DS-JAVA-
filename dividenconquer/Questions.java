package dividenconquer;

public class Questions {
    public static void main(String[] args) {

        // String[] arr = { "sun", "earth", "mars", "mercury" };
        // String[] a = sort(arr, 0, arr.length - 1);
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i] + " ");
        // }

        // int array[]={2,3,2,5,4,2,2};
        // System.out.println(majority(array,0,array.length-1));

        int arr[]={1,2,3,4,7,5,6};
        System.out.println(countInversion(arr));
    }

    // sorting the string array using merge sort
    public static String[] sort(String str[], int si, int ei) {
        if (si >= ei) {
            String[] A = { str[si] };
            return A;
        }
        int mid = si + (ei - si) / 2;
        String Str1[] = sort(str, si, mid);
        String Str2[] = sort(str, mid + 1, ei);
        String Str3[] = stringsort(Str1, Str2);
        return Str3;
    }
    public static String[] stringsort(String[] Str1, String[] Str2) {
        int m = Str1.length;
        int n = Str2.length;
        String[] temp = new String[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (smaller(Str1[i], Str2[j])) {
                temp[k] = Str1[i];
                i++;
                k++;
            } else {
                temp[k] = Str2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            temp[k++] = Str1[i++];
        }
        while (j < n) {
            temp[k++] = Str2[j++];
        }
        return temp;
    }
    static boolean smaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    // Finding majority element (occuring more than n/2 times in the array)

    // this code is using brute force and have a time complexity of (n^2)
    public static int majorityElement(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > (arr.length) / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    // using a code that will have less time complexity and use recursion for the problem
    public static int majority(int arr[],int si,int ei){
        if (si==ei) {
            return si;
        }
            int mid=(si+ei)/2;
            int left=majority(arr, si,mid-1);
            int right=majority(arr, mid+1, ei);
            
            if (left==right) {
                return left;
            }

            int leftcount=count(arr,left,si,ei);
            int rightcount=count(arr,right,si,ei);

            return leftcount>rightcount?left:right;
        }
    public static int count(int arr[],int num,int si,int ei){
            int count=0;
            for(int i=si;i<=ei;i++){
                if (arr[i]==num) {
                    count ++;
                }
                }
            return count;
        }


    // count the no of inversion i.e. how far or close is an array from being completely sorted

    // using brute force first time complexity if O(n^2)
    public static int countInversion(int arr[]){
        int invcount=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    invcount++;
                }
            }
        }
        return invcount;
    }

    // using recursive approach
    // public static int inversion_count(int arr[], int si,int ei){
    //     if (si>ei) {
    //         return arr[si];
    //     }
    // }
}

