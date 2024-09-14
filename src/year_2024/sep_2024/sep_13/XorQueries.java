package year_2024.sep_2024.sep_13;

import java.util.Arrays;

public class XorQueries {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < ans.length; i++) {
            int temp =arr[queries[i][0]];
            for (int j = queries[i][0]+1; j <= queries[i][1]; j++) {
                temp = temp^arr[j];
            }
            ans[i] = temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        XorQueries queries = new XorQueries();
        System.out.println(Arrays.toString(queries.xorQueries(new int[]{16},new int[][]{{0,0},{0,0},{0,0}})));
    }
}
