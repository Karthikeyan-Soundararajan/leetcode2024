package year_2024.nov_2024.nov_12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaximumBeauty {

    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (int[] a, int[]b) -> a[0]-b[0]);
        List<Integer> indices = IntStream.range(0, queries.length).boxed().sorted(Comparator.comparing(i -> queries[i])).collect(Collectors.toList());
        Arrays.sort(queries);
        int[] results = new int[queries.length];
        int max = 0;
        int queryIndex = 0;
        for (int i = 0; i < queries.length; i++) {
            while (queryIndex < items.length && items[queryIndex][0]<=queries[i]){
                int beauty = items[queryIndex][1];
                max = Math.max(max,beauty);
                queryIndex++;
            }
            results[indices.get(i)] = max;
        }
        return results;
    }

    public static void main(String[] args) {
        MaximumBeauty maximumBeauty = new MaximumBeauty();
//        System.out.println(Arrays.toString(maximumBeauty.maximumBeauty(new int[][]{{1,2},{3,2},{2,4},{5,6},{3,5}}, new int[]{1,2,3,4,5,6})));
//        System.out.println(Arrays.toString(maximumBeauty.maximumBeauty(new int[][]{{1,2},{1,2},{1,3},{1,4}}, new int[]{1})));
        System.out.println(Arrays.toString(maximumBeauty.maximumBeauty(new int[][]{{10,1000}}, new int[]{5})));
    }
}
