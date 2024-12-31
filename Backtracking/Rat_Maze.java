package Backtracking;

// page 5 
public class Rat_Maze {
    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 0, 0 },
                    { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
                
        int soln[][] = new int[arr.length][arr.length];
        ratInAMaze(arr, 0, 0,soln);
    }

    public static void printArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.err.println();
        }
    }

    public static boolean isSafe(int arr[][], int i, int j) {
        if (i >= 0 && j >= 0 && i < arr.length && j < arr.length && arr[i][j] == 1) {
            return true;
        }
        return false;
    }

    public static void ratInAMaze(int arr[][], int i, int j,int soln[][]) {
        if (i == arr.length - 1 && j == arr[0].length-1) {
            soln[i][j]=1;
            printArr(soln);
            soln[i][j]=0;
            return;
        }
            if (isSafe(arr, i, j)&&soln[i][j]==0) {
                soln[i][j] = 1;
                ratInAMaze(arr, i + 1, j,soln);
                ratInAMaze(arr, i, j + 1,soln);
                ratInAMaze(arr, i - 1, j,soln);
                ratInAMaze(arr, i, j - 1,soln);
                soln[i][j] = 0;
        }
    }
}
