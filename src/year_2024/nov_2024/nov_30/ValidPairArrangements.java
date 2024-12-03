package year_2024.nov_2024.nov_30;

import java.util.*;
import java.util.stream.Collectors;

public class ValidPairArrangements {

    Map<Integer, Integer> map = new HashMap<>();

    public int[][] validArrangement(int[][] pairs) {

        for (int i = 0; i < pairs.length; i++) {
            map.put(pairs[i][1],pairs[i][0]);
        }
        List<int[]> results = new ArrayList<>();
        results.add(pairs[0]);
        int start = pairs[0][0];
        getCyclePair(start,results,pairs.length);
        if (results.size()== pairs.length){
            return results.reversed().toArray(new int[results.size()][]);
        }else {
            results = results.reversed();
            map = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
            getCyclePair(results.get(results.size()-1)[1],results, pairs.length);
            return results.toArray(new int[results.size()][]);
        }
    }

    private void getCyclePair(int start, List<int[]> results, int length) {
        while (start!=-1){
            if (map.get(start)!=null&&results.size()<length){
                results.add(new int[]{map.get(start),start});
                start = map.get(start);
            }else {
                start = -1;
            }
        }
    }

    public static void main(String[] args) {
        ValidPairArrangements validPairArrangements = new ValidPairArrangements();
//        System.out.println(Arrays.deepToString(validPairArrangements.validArrangement(new int[][]{{5,1},{4,5},{11,9},{9,4}})));
//        System.out.println(Arrays.deepToString(validPairArrangements.validArrangement(new int[][]{{1,3},{3,2},{2,1}})));
        System.out.println(Arrays.deepToString(validPairArrangements.validArrangement(new int[][]{{1,2},{1,3},{2,1}})));
    }
}
