package arrays2D;

public class spiralmatrix {
    public static void spiral(int arr[][]) {
        int strtcol = 0;
        int strtrow = 0;
        int endrow = arr.length - 1;
        int endcol = arr[0].length - 1;

        // below condition is used to travesre the 2D matrix such that each cell is covered 
        while (strtrow <= endrow && strtcol <= endcol ) {
            // top
            for (int i = strtcol; i <= endcol; i++) {
                System.out.print(arr[strtrow][i] + " ");
            }System.out.println();

            // right
            for (int i = strtrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }System.out.println();

            // bottom
            for (int i = endcol - 1; i >= strtcol; i--) {
                System.out.print(arr[endrow][i]+" ");
            } System.out.println();
            
            // left
            for (int i = endrow - 1; i >= strtrow + 1; i--) {
                System.out.print(arr[i][strtcol] + " ");
            }
            System.out.println();
            strtcol++;
            strtrow++;
            endrow--;
            endcol--;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
                spiral(arr);
    }
}
