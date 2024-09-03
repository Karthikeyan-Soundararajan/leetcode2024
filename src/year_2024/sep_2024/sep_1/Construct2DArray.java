package year_2024.sep_2024.sep_1;

import java.util.Arrays;

public class Construct2DArray {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length){
            return new int[0][0];
        }
        int k =0;
        int[][] twodarray = new int[m][n];
        for (int i = 0; i < twodarray.length; i++) {
            for (int j = 0; j < twodarray[i].length; j++) {
                twodarray[i][j] = original[k];
                k++;
            }
        }
        return twodarray;
    }

    public static void main(String[] args) {
        Construct2DArray construct2DArray = new Construct2DArray();
        System.out.println(Arrays.deepToString(construct2DArray.construct2DArray(new int[]{1,2,3},1,3)));
    }
}
