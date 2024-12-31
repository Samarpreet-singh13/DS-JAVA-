package Leetcode;
// leetcode 2684
public class Gridwaysmax {
    class Solution {
        public int maxMoves(int[][] grid) {
            int n = grid.length, m = grid[0].length;
            int max = 0;
            Integer[][] memo = new Integer[n][m];
            for (int i = 0; i < n; i++) {
                max = Math.max(max, getmax(i, 0, grid,memo));
            }
            return max;
        }
    
        public static int getmax(int i, int j, int grid[][], Integer[][] memo) {
            int n = grid.length, m = grid[0].length;
    
            if (j==m-1) {
                return 0;
            }
            if (memo[i][j] != null) return memo[i][j];
            int max = 0;
            if (i - 1 >= 0 && j + 1 < m && grid[i - 1][j + 1] > grid[i][j]) {
                max = Math.max(max, 1 + getmax(i-1, j + 1, grid,memo));
            }
            if (j + 1 < m && grid[i][j + 1] > grid[i][j]) {
                max = Math.max(max, 1 + getmax(i, j + 1, grid,memo));
            }
            if (i + 1 < n && j + 1 < m && grid[i + 1][j + 1] > grid[i][j]) {
                max = Math.max(max, 1 + getmax(i + 1, j + 1, grid,memo));
            }
            memo[i][j]=max;
            return max;
        }
    } 
}
