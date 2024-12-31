// leetcode 529
package Leetcode;

public class Minesweeper {
    class Solution {
        public char[][] updateBoard(char[][] board, int[] click) {
            int row = click[0];
            int col = click[1];
            if (board[row][col] == 'M') {
                board[row][col] = 'X';
                return board;
            }
            reveal(board, row, col);
            return board;
        }
    
        public void reveal(char board[][], int row, int col) {
            if (board[row][col] != 'E')
                return;
    
            int count = countMines(board, row, col);
    
            if (count > 0) {
                board[row][col] = (char) (count + '0');
            } else {
                board[row][col] = 'B';

                if (row > 0 && col > 0)
                    reveal(board, row - 1, col - 1); // Top-left
                if (row > 0)
                    reveal(board, row - 1, col); // Top
                if (row > 0 && col < board[0].length - 1)
                    reveal(board, row - 1, col + 1); // Top-right
                if (col > 0)
                    reveal(board, row, col - 1); // Left
                if (col < board[0].length - 1)
                    reveal(board, row, col + 1); // Right
                if (row < board.length - 1 && col > 0)
                    reveal(board, row + 1, col - 1); // Bottom-left
                if (row < board.length - 1)
                    reveal(board, row + 1, col); // Bottom
                if (row < board.length - 1 && col < board[0].length - 1)
                    reveal(board, row + 1, col + 1);
            }
        }
    
        public int countMines(char[][] board, int row, int col) {
            int mineCount = 0;
            if (row > 0 && col > 0 && board[row - 1][col - 1] == 'M')
                mineCount++; // Top-left
            if (row > 0 && board[row - 1][col] == 'M')
                mineCount++; // Top
            if (row > 0 && col < board[0].length - 1 && board[row - 1][col + 1] == 'M')
                mineCount++; // Top-right
            if (col > 0 && board[row][col - 1] == 'M')
                mineCount++; // Left
            if (col < board[0].length - 1 && board[row][col + 1] == 'M')
                mineCount++; // Right
            if (row < board.length - 1 && col > 0 && board[row + 1][col - 1] == 'M')
                mineCount++; // Bottom-left
            if (row < board.length - 1 && board[row + 1][col] == 'M')
                mineCount++; // Bottom
            if (row < board.length - 1 && col < board[0].length - 1 && board[row + 1][col + 1] == 'M')
                mineCount++; // Bottom-right
    
            return mineCount;
        }
    }
}
