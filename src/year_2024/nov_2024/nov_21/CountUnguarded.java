package year_2024.nov_2024.nov_21;

public class CountUnguarded {

    private static final int GUARDED = 1;
    private static final int GUARD = 2;
    private static final int WALL = 3;

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] output = new int[m][n];
        for (int i = 0; i < walls.length; i++) {
            int[] wallPos = walls[i];
            output[wallPos[0]][wallPos[1]]= WALL;
        }
        for (int i = 0; i < guards.length; i++) {
            int[] guardsPos = guards[i];
            output[guardsPos[0]][guardsPos[1]]= GUARD;
        }
        for (int i = 0; i < guards.length; i++) {
            markUnguarded(guards[i][0],guards[i][1],output);
        }
        int count = 0;
        for (int i = 0; i < output.length; i++) {
            int[] ele = output[i];
            for (int j = 0; j < ele.length; j++) {
                if (ele[j]==0){
                    count++;
                }
            }
        }
        return count;
    }

    private void markUnguarded(int row, int col, int[][] output) {
        for (int i = row+1; i < output.length; i++) {
            if (output[i][col] == WALL || output[i][col] == GUARD)
                break;
            output[i][col] = GUARDED;
        }
        for (int i = row-1; i >= 0; i--) {
            if (output[i][col] == WALL || output[i][col] == GUARD)
                break;
                output[i][col] = GUARDED;
        }
        for (int i = col+1; i < output[0].length; i++) {
            if (output[row][i] == WALL || output[row][i] == GUARD)
                break;
            output[row][i] = GUARDED;
        }
        for (int i = col-1; i >= 0; i--) {
            if (output[row][i] == WALL || output[row][i] == GUARD)
                break;
            output[row][i] = GUARDED;
        }
    }

    public static void main(String[] args) {
        CountUnguarded countUnguarded = new CountUnguarded();
        System.out.println(countUnguarded.countUnguarded(4,6,new int[][]{{0,0},{1,1},{2,3}}, new int[][]{{0,1},{2,2},{1,4}}));
        System.out.println(countUnguarded.countUnguarded(3,3,new int[][]{{1,1}}, new int[][]{{0,1},{1,0},{2,1},{1,2}}));
    }
}
