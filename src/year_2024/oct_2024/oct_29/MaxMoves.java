package year_2024.oct_2024.oct_29;

import java.util.Arrays;

public class MaxMoves {

    int[] dirs = new int[]{-1,0,1};

    public int maxMoves(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        int maxMoves = 0;
        for (int i = 0; i < dp.length; i++) {
            int currentColumnMoves = DFS(i,0,grid,dp);
            maxMoves = Math.max(maxMoves,currentColumnMoves);
        }
        return maxMoves;
    }

    private int DFS(int row, int col, int[][] grid, int[][] dp) {
        if (dp[row][col]!=-1){
            return dp[row][col];
        }
        int maxMoves = 0;
        for (int dir : dirs) {
            int newRow = row + dir, newCol = col + 1;
            if (newRow > -1 && newRow < grid.length && newCol < grid[0].length && grid[row][col] < grid[newRow][newCol]) {
                maxMoves = Math.max(maxMoves, 1 + DFS(newRow, newCol, grid, dp));
            }
        }
        dp[row][col] = maxMoves;
        return maxMoves;
    }

    public static void main(String[] args) {
        MaxMoves moves = new MaxMoves();
        System.out.println(moves.maxMoves(new int[][]{{65,200,263,220,91,183,2,187,175,61,225,120,39},{111,242,294,31,241,90,145,25,262,214,145,71,294},{152,25,240,69,279,238,222,9,137,277,8,143,143},{189,31,86,250,20,63,188,209,75,22,127,272,110},{122,94,298,25,90,169,68,3,208,274,202,135,275},{205,20,171,90,70,272,280,138,142,151,80,122,130},{284,272,271,269,265,134,185,243,247,50,283,20,232},{266,236,265,234,249,62,98,130,122,226,285,168,204},{231,24,256,101,142,28,268,82,111,63,115,13,144},{277,277,31,144,49,132,28,138,133,29,286,45,93},{163,96,25,9,3,159,148,59,25,81,233,127,12},{127,38,31,209,300,256,15,43,74,64,73,141,200}}));
    }
}
