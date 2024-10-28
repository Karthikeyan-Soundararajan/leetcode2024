package year_2024.oct_2024.oct_27;

public class CountSquares {

    public int countSquares(int[][] matrix) {
        int count = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            int[] row = matrix[i];
//            for (int j = 0; j < row.length; j++) {
//                if (row[j]==1)
//                    count++;
//            }
//        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                for (int k = j; k <= j; k++) {

                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountSquares squares = new CountSquares();
        System.out.println(squares.countSquares(new int[][]{{0,1,1,1},
                {1,1,1,1},
                {0,1,1,1}}));
    }
}
