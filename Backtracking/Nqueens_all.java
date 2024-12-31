package Backtracking;

public class Nqueens_all {
    public static void main(String[] args) {
        int n = 6;
        char board[][]=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='.';
            }
        }
        nqueens(board, 0);
        
    }

    // to print the character array 
    public static void printBoard(char board[][]){
        System.out.println("---------chess board-----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    // this function will check the best position for the Q to place and then return true or false according to the posiiton 
    public static boolean issafe(char board[][],int row,int col){
        // vertical up
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }

        // left up diagnol
        for (int i = row-1,j=col-1; i >= 0&&j>=0  ; i--,j--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }

        // right up diagnol 
        for (int i = row-1,j=col+1; i >=0&&j<board.length; i--,j++) {
            if (board[i][j]=='Q') {
                return false;
            }
        }

        return true;
    }

    public static void nqueens(char board[][],int row){
        if (row==board.length) {
            printBoard(board);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if(issafe(board,row,i)){
                board[row][i]='Q';
                nqueens(board, row+1); // recursively call the function to print Q
                board[row][i]='.';  // backtracking of the call stack
             }
        }
    }
}
