package year_2024.sep_2024.sep_13;

import java.util.Arrays;

public class XorQueries2 {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = arr[i] ^ prefixSum[i-1];
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < ans.length; i++) {
            if (queries[i][0]==0){
                ans[i] = prefixSum[queries[i][1]];
            }else {
                ans[i] = prefixSum[queries[i][1]]^prefixSum[queries[i][0]-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        XorQueries2 queries = new XorQueries2();
        System.out.println(1^3^5);
        System.out.println(7^3^5);
        System.out.println(1^7^5);
        System.out.println(1^3^7);
        System.out.println(Arrays.toString(queries.xorQueries(new int[]{16},new int[][]{{0,0},{0,0},{0,0}})));
        System.out.println(Arrays.toString(queries.xorQueries(new int[]{1,3,4,8},new int[][]{{0,1},{1,2},{0,3},{3,3}})));
    }
}
